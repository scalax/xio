package xio

import xio.nat.error.NatEitherSetter
import zio.ZIO

trait ErrorContent[T, I <: xio.nat.error.NatEither] {
  def error: T
  def inputError[N](n: N)(implicit i: NatEitherSetter[I, N]): XIO[Any, I, Nothing] = new XIO(ZIO.fail(i.put(n)))
  def lift[N](n: N)(implicit i: NatEitherSetter[I, N]): I                          = i.put(n)
}

class ErrorContentImpl[T, I <: xio.nat.error.NatEither](override val error: T) extends ErrorContent[T, I]
