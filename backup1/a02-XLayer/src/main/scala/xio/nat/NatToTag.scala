package xio.nat

trait NatToTag[T <: Nat, N <: Nat] {
  def tag(input: N): T
}

object NatToTag {
  implicit def zeroNat[N <: Nat]: NatToTag[NatZero, N] = new NatToTagZero
  implicit def positiveNat[Head, TagTail <: Nat, N <: Nat](implicit
    to: NatToTag[TagTail, N],
    p: HeaderFunctor[N, Head]
  ): NatToTag[NatPositive[TagTail, Head], N] = new NatToTagPositive(to = to, p = p)
}

class NatToTagZero[N <: Nat] extends NatToTag[NatZero, N] {
  override def tag(input: N): NatZero = NatZero
}

class NatToTagPositive[NatTail <: Nat, NatHead, N <: Nat](to: NatToTag[NatTail, N], p: HeaderFunctor[N, NatHead]) extends NatToTag[NatPositive[NatTail, NatHead], N] {
  override def tag(input: N): NatPositive[NatTail, NatHead] = new NatPositive(tail = to.tag(input), head = p.to(input))
}
