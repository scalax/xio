package xio

import xio.nat.error.{NatEither, NatEitherPositive, NatEitherReversePlus, NatEitherSetter, NatEitherToTag, NatEitherZero}
import xio.nat.has.{Nat, NatReversePlus, NatToTag, NatZero}

import scala.language.implicitConversions
import zio._

import scala.concurrent.ExecutionContext

trait XIO[I <: Nat, L <: NatEither, R] {
  self =>

  def zio: ZIO[I, L, R]
  def noErrorZIO(implicit ev: L <:< NatEitherZero): ZIO[I, Nothing, R] = self.zio.asInstanceOf[ZIO[I, Nothing, R]]

  def map[E1](cv: R => E1): XIO[I, L, E1] = XIO.fromZIO(zio.map(cv))

  def flatMap[I1 <: Nat, L1 <: NatEither, E1](cv: R => XIO[I1, L1, E1])(implicit v: NatReversePlus[I, I1],
                                                                        n: NatEitherReversePlus[L, L1]): XIO[I1#Plus[I], L1#Plus[L], E1] =
    XIOHelper.simpleFlatMap(XIO.fromFunction[L1#Plus[L]](identity[I1#Plus[I]]))(plus =>
      XIOHelper.simpleFlatMap(XIOHelper.simpeMapError(XIOHelper.simpleProvide(self)(v.takeTail(plus)))(n.takeTail))(n1 =>
        XIOHelper.simpeMapError(XIOHelper.simpleProvide(cv(n1))(v.takeHead(plus)))(n.takeHead)))

  def mapError[E1, ESUM <: NatEither](n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM)(
    implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): XIO[I, ESUM, R] =
    XIOHelper.simpeMapError(self)(l => nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply)))

  final def provideLayer[E1 <: NatEither, R0 <: Nat, R1 <: Nat](
    layer: XLayer[R0, E1, R1]
  )(implicit ev1: NatToTag[I, R1], ev2: NatEitherReversePlus[L, E1]): XIO[R0, E1#Plus[L], R] =
    XIOHelper.simpleProvideLayer(XIOHelper.simpeMapError(self)(ev2.takeTail))(layer.map(ev1.tag).scalax_simpeMapError(ev2.takeHead))

  final def provide[R1 <: Nat](r: R1)(implicit ev: NatToTag[I, R1]): XIO[NatZero, L, R] = XIOHelper.simpleProvide(self)(ev.tag(r))

  final def either: XIO[I, XError0, Either[L, R]] = new XIO[I, XError0, Either[L, R]] {
    override val zio: ZIO[I, XError0, Either[L, R]] = self.zio.either
  }

  final def catchAll[R1 <: Nat, E2 <: NatEither, A1 >: R](h: L => XIO[R1, E2, A1])(implicit n: NatToTag[I, R1]): XIO[R1, E2, A1] =
    XIOHelper.simpleCatchAll(XIOHelper.simpleProvideLayer(self)(XLayer.fromFunctionMany[L](n.tag)))(h)

  final def retryN(n: Int): XIO[I, L, R] =
    XIOHelper.simpleCatchAll(self)(e => if (n <= 0) XIOHelper.simpleFail(e) else self.retryN(n - 1))

}

object XIO {

  private def identityFn[A]: A => A = s => s

  implicit def xioImplicit[I1 <: Nat, I2 <: Nat, E1 <: NatEither, E2 <: NatEither, O1, O2](
    i: XIO[I1, E1, O1])(implicit cv: NatToTag[I1, I2], v: NatEitherToTag[E1, E2], cv3: O1 <:< O2): XIO[I2, E2, O2] =
    XIOHelper.simpleProvideLayer(XIOHelper.simpeMapError(i)(v.tag).map(cv3))(XLayer.fromFunctionMany[E2](cv.tag))

  def identity[T <: Nat]: XIO[T, XError0, T] = XIO.fromFunction(identityFn)

  def fail[T](i: T): XIO[XHas#_0, XError1[T], Nothing]                          = XIOHelper.simpleFail(new NatEitherPositive(Right(i)))
  def fromOption[T](i: => Option[T]): XIO[XHas#_0, XError1[Option[Nothing]], T] = XIOHelper.simpleFromOption(i)

  def fromFutureInterrupt[A](make: ExecutionContext => scala.concurrent.Future[A]): XIO[XHas#_0, XError1[Throwable], A] =
    XIO.fromZIO(ZIO.fromFutureInterrupt(f => make(f)).mapError(s => new NatEitherPositive(Right(s))))

  def fromUIO[I](u: UIO[I]): XIO[XHas#_0, XError0, I] = XIO.fromZIO(u)

  def fromRIO[P <: Nat, I](u: RIO[P, I]): XIO[P, XError1[Throwable], I] = XIO.fromZIO(u.mapError(n => new NatEitherPositive(Right(n))))
  def fromTask[I](u: Task[I]): XIO[NatZero, XError1[Throwable], I]      = XIO.fromZIO(u.mapError(n => new NatEitherPositive(Right(n))))
  def fromIO[E <: NatEither, I](i: IO[E, I]): XIO[NatZero, E, I]        = XIO.fromZIO(i)

  def effect[A](effect: => A): XIO[XHas#_0, XError1[Throwable], A] = XIO.fromZIO(ZIO.effect(effect).mapError(e => new NatEitherPositive(Right(e))))

  class FunctinManyApply[ErrorType <: NatEither] {
    def apply[N <: Nat, A](effect: N => A): XIO[N, ErrorType, A] = XIO.fromZIO(ZIO.fromFunction(effect))
  }

  def fromFunction[NErrorType <: NatEither]: FunctinManyApply[NErrorType] = new FunctinManyApply[NErrorType]

  class XIOImpl[I <: Nat, L <: NatEither, R](override val zio: ZIO[I, L, R]) extends XIO[I, L, R]

  def fromZIO[I <: Nat, L <: NatEither, R](i: ZIO[I, L, R]): XIO[I, L, R] = new XIOImpl(i)

  def collectAll[R <: Nat, E <: NatEither, A, Collection[+Element] <: Iterable[Element]](in: Collection[XIO[R, E, A]])(
    implicit bf: BuildFrom[Collection[XIO[R, E, A]], A, Collection[A]]): XIO[R, E, Collection[A]] =
    XIOHelper.simpleForeach(in)(identityFn)

}
