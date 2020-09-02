package xio.nat.has

trait Nat {
  type InnerPlus[I <: Nat] <: Nat
  type Plus[I <: Nat] <: Nat
  type SelfType <: Nat

  def innerPlus[I <: Nat](i: I): InnerPlus[I]
  def plus[I <: Nat](i: I): Plus[I]
  def selfType: SelfType
}

class NatZero extends Nat {
  self =>
  override type InnerPlus[I <: Nat] = I
  override type Plus[I <: Nat]      = I#InnerPlus[NatZero]
  override type SelfType            = NatZero

  override def innerPlus[I <: Nat](i: I): I               = i
  override def plus[I <: Nat](i: I): I#InnerPlus[NatZero] = i.innerPlus(self)
  override def selfType: NatZero                          = self
  override def toString: String                           = "NatZero"
}

object NatZero extends NatZero

class NatPositive[Tail <: Nat, Head](val tail: Tail, val head: Head) extends Nat {
  self =>
  override type InnerPlus[I <: Nat] = NatPositive[Tail#InnerPlus[I], Head]
  override type Plus[I <: Nat]      = I#SelfType#InnerPlus[NatPositive[Tail, Head]]
  override type SelfType            = NatPositive[Tail, Head]

  override def innerPlus[I <: Nat](i: I): NatPositive[Tail#InnerPlus[I], Head]     = new NatPositive(tail.innerPlus(i), head)
  override def plus[I <: Nat](i: I): I#SelfType#InnerPlus[NatPositive[Tail, Head]] = i.selfType.innerPlus(self)
  override def selfType: NatPositive[Tail, Head]                                   = self
  def get[P](implicit headerFunctor: NatFinder[NatPositive[Tail, Head], P]): P     = headerFunctor.to(self)
  override def toString: String                                                    = s"${tail} :: ${head}"
}
