package a10

import xio.nat.has.Nat

trait 自然数容器 {
  type 数对 <: Nat
  type 数标记 <: 自然数标记
  val 数对: 数对
  val 数标记: 数标记

  type NatPair <: 自然数对
  def natPair: NatPair

  def get[Head](implicit i: 提取正整数自然数对[NatPair, Head]): Head = i.pii(natPair)

  type _0 <: 自然数容器
  def _0: _0
  type _1 <: 自然数容器
  def _1: _1
  type _2 <: 自然数容器
  def _2: _2
  type _3 <: 自然数容器
  def _3: _3
  type _4 <: 自然数容器
  def _4: _4
  type _5 <: 自然数容器
  def _5: _5
  type _6 <: 自然数容器
  def _6: _6
  type _7 <: 自然数容器
  def _7: _7
  type _8 <: 自然数容器
  def _8: _8
  type _9 <: 自然数容器
  def _9: _9
}

class 自然数容器I[Pair <: Nat, TagPair <: 自然数标记](override val 数对: Pair, override val 数标记: TagPair) extends 自然数容器 {
  self =>
  override type 数对      = Pair
  override type 数标记     = TagPair
  override type NatPair = Pair#消去标记[TagPair]
  override def natPair: Pair#消去标记[TagPair] = 数对.消去标记(数标记)

  override type _0 = 自然数容器I[Pair, 自然数容器I.Tag_10#乘以[TagPair]]
  override def _0: _0 = 自然数容器I(数对 = 数对, 数标记 = 自然数容器I.tag_10.乘以(数标记))
  override type _1 = 自然数容器I[Pair, 自然数容器I.Tag_1#加[自然数容器I.Tag_10#乘以[TagPair]]]
  override def _1: _1 = 自然数容器I(数对 = 数对, 数标记 = new 正整数标记(自然数容器I.tag_10.乘以(数标记)))
  override type _2 = 自然数容器I[Pair, 自然数容器I.Tag_2#加[自然数容器I.Tag_10#乘以[TagPair]]]
  override def _2: _2 = 自然数容器I(数对 = 数对, 数标记 = new 正整数标记(new 正整数标记(自然数容器I.tag_10.乘以(数标记))))
  override type _3 = 自然数容器I[Pair, 自然数容器I.Tag_3#加[自然数容器I.Tag_10#乘以[TagPair]]]
  override def _3: _3 = 自然数容器I(数对 = 数对, 数标记 = new 正整数标记(new 正整数标记(new 正整数标记(自然数容器I.tag_10.乘以(数标记)))))
  override type _4 = 自然数容器I[Pair, 自然数容器I.Tag_4#加[自然数容器I.Tag_10#乘以[TagPair]]]
  override def _4: _4 = 自然数容器I(数对 = 数对, 数标记 = new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(自然数容器I.tag_10.乘以(数标记))))))
  override type _5 = 自然数容器I[Pair, 自然数容器I.Tag_5#加[自然数容器I.Tag_10#乘以[TagPair]]]
  override def _5: _5 = 自然数容器I(数对 = 数对, 数标记 = new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(自然数容器I.tag_10.乘以(数标记)))))))
  override type _6 = 自然数容器I[Pair, 自然数容器I.Tag_6#加[自然数容器I.Tag_10#乘以[TagPair]]]
  override def _6: _6 = 自然数容器I(数对 = 数对, 数标记 = new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(自然数容器I.tag_10.乘以(数标记))))))))
  override type _7 = 自然数容器I[Pair, 自然数容器I.Tag_7#加[自然数容器I.Tag_10#乘以[TagPair]]]
  override def _7: _7 = 自然数容器I(数对 = 数对, 数标记 = new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(自然数容器I.tag_10.乘以(数标记)))))))))
  override type _8 = 自然数容器I[Pair, 自然数容器I.Tag_8#加[自然数容器I.Tag_10#乘以[TagPair]]]
  override def _8: _8 = 自然数容器I(数对 = 数对, 数标记 = new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(自然数容器I.tag_10.乘以(数标记))))))))))
  override type _9 = 自然数容器I[Pair, 自然数容器I.Tag_9#加[自然数容器I.Tag_10#乘以[TagPair]]]
  override def _9: _9 = 自然数容器I(数对 = 数对, 数标记 = new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(new 正整数标记(自然数容器I.tag_10.乘以(数标记)))))))))))

  override def toString: String = s"自然数容器I(数对 = ${数对}, 数标记 = ${数标记})"
}

object 自然数容器I {

  def apply[Pair <: Nat, TagPair <: 自然数标记](数对: Pair, 数标记: TagPair): 自然数容器I[Pair, TagPair] = new 自然数容器I(数对 = 数对, 数标记 = 数标记)

  type Tag_1 = 正整数标记[自然数标记零]
  val tag_1: Tag_1 = new 正整数标记(自然数标记零.value)
  type Tag_2 = 正整数标记[Tag_1]
  val tag_2: Tag_2 = new 正整数标记(tag_1)
  type Tag_3 = 正整数标记[Tag_2]
  val tag_3: Tag_3 = new 正整数标记(tag_2)
  type Tag_4 = 正整数标记[Tag_3]
  val tag_4: Tag_4 = new 正整数标记(tag_3)
  type Tag_5 = 正整数标记[Tag_4]
  val tag_5: Tag_5 = new 正整数标记(tag_4)
  type Tag_6 = 正整数标记[Tag_5]
  val tag_6: Tag_6 = new 正整数标记(tag_5)
  type Tag_7 = 正整数标记[Tag_6]
  val tag_7: Tag_7 = new 正整数标记(tag_6)
  type Tag_8 = 正整数标记[Tag_7]
  val tag_8: Tag_8 = new 正整数标记(tag_7)
  type Tag_9 = 正整数标记[Tag_8]
  val tag_9: Tag_9 = new 正整数标记(tag_8)
  type Tag_10 = 正整数标记[Tag_9]
  val tag_10: Tag_10 = new 正整数标记(tag_9)

}
