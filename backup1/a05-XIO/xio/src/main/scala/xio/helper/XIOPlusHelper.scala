package xio.helper
object XIOPlusHelper {
  def takePlus1[I <: xio.nat.has.Nat, I1 <: xio.nat.has.Nat](
    i1: xio.nat.has.NatReversePlus[I1, I]
  ): xio.XHasM2[I, I1] => I1 = i => i1.takeTail(i)
  def takePlus2[I <: xio.nat.has.Nat, I1 <: xio.nat.has.Nat, I2 <: xio.nat.has.Nat](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]]
  ): xio.XHasM2[xio.XHasM2[I, I1], I2] => I1 =
    i => takePlus1(i1)(i2.takeHead(i))
  def takePlus3[I <: xio.nat.has.Nat, I1 <: xio.nat.has.Nat, I2 <: xio.nat.has.Nat, I3 <: xio.nat.has.Nat](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]]
  ): xio.XHasM2[xio.XHasM3[I, I1, I2], I3] => I1 =
    i => takePlus2(i1, i2)(i3.takeHead(i))
  def takePlus4[I <: xio.nat.has.Nat, I1 <: xio.nat.has.Nat, I2 <: xio.nat.has.Nat, I3 <: xio.nat.has.Nat, I4 <: xio.nat.has.Nat](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]]
  ): xio.XHasM2[xio.XHasM4[I, I1, I2, I3], I4] => I1 =
    i => takePlus3(i1, i2, i3)(i4.takeHead(i))
  def takePlus5[I <: xio.nat.has.Nat, I1 <: xio.nat.has.Nat, I2 <: xio.nat.has.Nat, I3 <: xio.nat.has.Nat, I4 <: xio.nat.has.Nat, I5 <: xio.nat.has.Nat](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]]
  ): xio.XHasM2[xio.XHasM5[I, I1, I2, I3, I4], I5] => I1 =
    i => takePlus4(i1, i2, i3, i4)(i5.takeHead(i))
  def takePlus6[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]]
  ): xio.XHasM2[xio.XHasM6[I, I1, I2, I3, I4, I5], I6] => I1 =
    i => takePlus5(i1, i2, i3, i4, i5)(i6.takeHead(i))
  def takePlus7[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]]
  ): xio.XHasM2[xio.XHasM7[I, I1, I2, I3, I4, I5, I6], I7] => I1 =
    i => takePlus6(i1, i2, i3, i4, i5, i6)(i7.takeHead(i))
  def takePlus8[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]]
  ): xio.XHasM2[xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7], I8] => I1 =
    i => takePlus7(i1, i2, i3, i4, i5, i6, i7)(i8.takeHead(i))
  def takePlus9[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]]
  ): xio.XHasM2[xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8], I9] => I1 =
    i => takePlus8(i1, i2, i3, i4, i5, i6, i7, i8)(i9.takeHead(i))
  def takePlus10[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]]
  ): xio.XHasM2[xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9], I10] => I1 =
    i => takePlus9(i1, i2, i3, i4, i5, i6, i7, i8, i9)(i10.takeHead(i))
  def takePlus11[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]]
  ): xio.XHasM2[xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10], I11] => I1 =
    i => takePlus10(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10)(i11.takeHead(i))
  def takePlus12[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]]
  ): xio.XHasM2[xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11], I12] => I1 =
    i => takePlus11(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11)(i12.takeHead(i))
  def takePlus13[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]]
  ): xio.XHasM2[xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12], I13] => I1 =
    i => takePlus12(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12)(i13.takeHead(i))
  def takePlus14[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]]
  ): xio.XHasM2[xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13], I14] => I1 =
    i => takePlus13(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13)(i14.takeHead(i))
  def takePlus15[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]]
  ): xio.XHasM2[xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14], I15] => I1 =
    i => takePlus14(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14)(i15.takeHead(i))
  def takePlus16[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]]
  ): xio.XHasM2[xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15], I16] => I1 =
    i => takePlus15(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15)(i16.takeHead(i))
  def takePlus17[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]]
  ): xio.XHasM2[xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16], I17] => I1 =
    i => takePlus16(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16)(i17.takeHead(i))
  def takePlus18[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat,
    I18 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]],
    i18: xio.nat.has.NatReversePlus[I18, xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]]
  ): xio.XHasM2[xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17], I18] => I1 =
    i => takePlus17(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17)(i18.takeHead(i))
  def takePlus19[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat,
    I18 <: xio.nat.has.Nat,
    I19 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]],
    i18: xio.nat.has.NatReversePlus[I18, xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]],
    i19: xio.nat.has.NatReversePlus[I19, xio.XHasM19[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]]
  ): xio.XHasM2[xio.XHasM19[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18], I19] => I1 =
    i => takePlus18(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18)(i19.takeHead(i))
  def takePlus20[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat,
    I18 <: xio.nat.has.Nat,
    I19 <: xio.nat.has.Nat,
    I20 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]],
    i18: xio.nat.has.NatReversePlus[I18, xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]],
    i19: xio.nat.has.NatReversePlus[I19, xio.XHasM19[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]],
    i20: xio.nat.has.NatReversePlus[I20, xio.XHasM20[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]]
  ): xio.XHasM2[xio.XHasM20[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19], I20] => I1 =
    i => takePlus19(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19)(i20.takeHead(i))
  def takePlus21[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat,
    I18 <: xio.nat.has.Nat,
    I19 <: xio.nat.has.Nat,
    I20 <: xio.nat.has.Nat,
    I21 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]],
    i18: xio.nat.has.NatReversePlus[I18, xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]],
    i19: xio.nat.has.NatReversePlus[I19, xio.XHasM19[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]],
    i20: xio.nat.has.NatReversePlus[I20, xio.XHasM20[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]],
    i21: xio.nat.has.NatReversePlus[I21, xio.XHasM21[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]]
  ): xio.XHasM2[xio.XHasM21[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20], I21] => I1 =
    i => takePlus20(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20)(i21.takeHead(i))
  def takePlus22[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat,
    I18 <: xio.nat.has.Nat,
    I19 <: xio.nat.has.Nat,
    I20 <: xio.nat.has.Nat,
    I21 <: xio.nat.has.Nat,
    I22 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]],
    i18: xio.nat.has.NatReversePlus[I18, xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]],
    i19: xio.nat.has.NatReversePlus[I19, xio.XHasM19[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]],
    i20: xio.nat.has.NatReversePlus[I20, xio.XHasM20[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]],
    i21: xio.nat.has.NatReversePlus[I21, xio.XHasM21[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]],
    i22: xio.nat.has.NatReversePlus[I22, xio.XHasM22[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21]]
  ): xio.XHasM2[xio.XHasM22[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21], I22] => I1 =
    i => takePlus21(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21)(i22.takeHead(i))
  def take1Plus1[I <: xio.nat.has.Nat, I1 <: xio.nat.has.Nat](
    i1: xio.nat.has.NatReversePlus[I1, I]
  ): xio.XHasM2[I, I1] => I = (i => i1.takeHead(i))
  def take1Plus2[I <: xio.nat.has.Nat, I1 <: xio.nat.has.Nat, I2 <: xio.nat.has.Nat](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]]
  ): xio.XHasM2[xio.XHasM2[I, I1], I2] => I =
    i => take1Plus1(i1)(i2.takeHead(i))
  def take1Plus3[I <: xio.nat.has.Nat, I1 <: xio.nat.has.Nat, I2 <: xio.nat.has.Nat, I3 <: xio.nat.has.Nat](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]]
  ): xio.XHasM2[xio.XHasM3[I, I1, I2], I3] => I =
    i => take1Plus2(i1, i2)(i3.takeHead(i))
  def take1Plus4[I <: xio.nat.has.Nat, I1 <: xio.nat.has.Nat, I2 <: xio.nat.has.Nat, I3 <: xio.nat.has.Nat, I4 <: xio.nat.has.Nat](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]]
  ): xio.XHasM2[xio.XHasM4[I, I1, I2, I3], I4] => I =
    i => take1Plus3(i1, i2, i3)(i4.takeHead(i))
  def take1Plus5[I <: xio.nat.has.Nat, I1 <: xio.nat.has.Nat, I2 <: xio.nat.has.Nat, I3 <: xio.nat.has.Nat, I4 <: xio.nat.has.Nat, I5 <: xio.nat.has.Nat](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]]
  ): xio.XHasM2[xio.XHasM5[I, I1, I2, I3, I4], I5] => I =
    i => take1Plus4(i1, i2, i3, i4)(i5.takeHead(i))
  def take1Plus6[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]]
  ): xio.XHasM2[xio.XHasM6[I, I1, I2, I3, I4, I5], I6] => I =
    i => take1Plus5(i1, i2, i3, i4, i5)(i6.takeHead(i))
  def take1Plus7[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]]
  ): xio.XHasM2[xio.XHasM7[I, I1, I2, I3, I4, I5, I6], I7] => I =
    i => take1Plus6(i1, i2, i3, i4, i5, i6)(i7.takeHead(i))
  def take1Plus8[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]]
  ): xio.XHasM2[xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7], I8] => I =
    i => take1Plus7(i1, i2, i3, i4, i5, i6, i7)(i8.takeHead(i))
  def take1Plus9[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]]
  ): xio.XHasM2[xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8], I9] => I =
    i => take1Plus8(i1, i2, i3, i4, i5, i6, i7, i8)(i9.takeHead(i))
  def take1Plus10[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]]
  ): xio.XHasM2[xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9], I10] => I =
    i => take1Plus9(i1, i2, i3, i4, i5, i6, i7, i8, i9)(i10.takeHead(i))
  def take1Plus11[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]]
  ): xio.XHasM2[xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10], I11] => I =
    i => take1Plus10(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10)(i11.takeHead(i))
  def take1Plus12[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]]
  ): xio.XHasM2[xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11], I12] => I =
    i => take1Plus11(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11)(i12.takeHead(i))
  def take1Plus13[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]]
  ): xio.XHasM2[xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12], I13] => I =
    i => take1Plus12(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12)(i13.takeHead(i))
  def take1Plus14[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]]
  ): xio.XHasM2[xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13], I14] => I =
    i => take1Plus13(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13)(i14.takeHead(i))
  def take1Plus15[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]]
  ): xio.XHasM2[xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14], I15] => I =
    i => take1Plus14(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14)(i15.takeHead(i))
  def take1Plus16[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]]
  ): xio.XHasM2[xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15], I16] => I =
    i => take1Plus15(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15)(i16.takeHead(i))
  def take1Plus17[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]]
  ): xio.XHasM2[xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16], I17] => I =
    i => take1Plus16(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16)(i17.takeHead(i))
  def take1Plus18[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat,
    I18 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]],
    i18: xio.nat.has.NatReversePlus[I18, xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]]
  ): xio.XHasM2[xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17], I18] => I =
    i => take1Plus17(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17)(i18.takeHead(i))
  def take1Plus19[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat,
    I18 <: xio.nat.has.Nat,
    I19 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]],
    i18: xio.nat.has.NatReversePlus[I18, xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]],
    i19: xio.nat.has.NatReversePlus[I19, xio.XHasM19[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]]
  ): xio.XHasM2[xio.XHasM19[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18], I19] => I =
    i => take1Plus18(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18)(i19.takeHead(i))
  def take1Plus20[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat,
    I18 <: xio.nat.has.Nat,
    I19 <: xio.nat.has.Nat,
    I20 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]],
    i18: xio.nat.has.NatReversePlus[I18, xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]],
    i19: xio.nat.has.NatReversePlus[I19, xio.XHasM19[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]],
    i20: xio.nat.has.NatReversePlus[I20, xio.XHasM20[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]]
  ): xio.XHasM2[xio.XHasM20[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19], I20] => I =
    i => take1Plus19(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19)(i20.takeHead(i))
  def take1Plus21[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat,
    I18 <: xio.nat.has.Nat,
    I19 <: xio.nat.has.Nat,
    I20 <: xio.nat.has.Nat,
    I21 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]],
    i18: xio.nat.has.NatReversePlus[I18, xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]],
    i19: xio.nat.has.NatReversePlus[I19, xio.XHasM19[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]],
    i20: xio.nat.has.NatReversePlus[I20, xio.XHasM20[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]],
    i21: xio.nat.has.NatReversePlus[I21, xio.XHasM21[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]]
  ): xio.XHasM2[xio.XHasM21[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20], I21] => I =
    i => take1Plus20(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20)(i21.takeHead(i))
  def take1Plus22[
    I <: xio.nat.has.Nat,
    I1 <: xio.nat.has.Nat,
    I2 <: xio.nat.has.Nat,
    I3 <: xio.nat.has.Nat,
    I4 <: xio.nat.has.Nat,
    I5 <: xio.nat.has.Nat,
    I6 <: xio.nat.has.Nat,
    I7 <: xio.nat.has.Nat,
    I8 <: xio.nat.has.Nat,
    I9 <: xio.nat.has.Nat,
    I10 <: xio.nat.has.Nat,
    I11 <: xio.nat.has.Nat,
    I12 <: xio.nat.has.Nat,
    I13 <: xio.nat.has.Nat,
    I14 <: xio.nat.has.Nat,
    I15 <: xio.nat.has.Nat,
    I16 <: xio.nat.has.Nat,
    I17 <: xio.nat.has.Nat,
    I18 <: xio.nat.has.Nat,
    I19 <: xio.nat.has.Nat,
    I20 <: xio.nat.has.Nat,
    I21 <: xio.nat.has.Nat,
    I22 <: xio.nat.has.Nat
  ](
    i1: xio.nat.has.NatReversePlus[I1, xio.XHasM1[I]],
    i2: xio.nat.has.NatReversePlus[I2, xio.XHasM2[I, I1]],
    i3: xio.nat.has.NatReversePlus[I3, xio.XHasM3[I, I1, I2]],
    i4: xio.nat.has.NatReversePlus[I4, xio.XHasM4[I, I1, I2, I3]],
    i5: xio.nat.has.NatReversePlus[I5, xio.XHasM5[I, I1, I2, I3, I4]],
    i6: xio.nat.has.NatReversePlus[I6, xio.XHasM6[I, I1, I2, I3, I4, I5]],
    i7: xio.nat.has.NatReversePlus[I7, xio.XHasM7[I, I1, I2, I3, I4, I5, I6]],
    i8: xio.nat.has.NatReversePlus[I8, xio.XHasM8[I, I1, I2, I3, I4, I5, I6, I7]],
    i9: xio.nat.has.NatReversePlus[I9, xio.XHasM9[I, I1, I2, I3, I4, I5, I6, I7, I8]],
    i10: xio.nat.has.NatReversePlus[I10, xio.XHasM10[I, I1, I2, I3, I4, I5, I6, I7, I8, I9]],
    i11: xio.nat.has.NatReversePlus[I11, xio.XHasM11[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]],
    i12: xio.nat.has.NatReversePlus[I12, xio.XHasM12[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]],
    i13: xio.nat.has.NatReversePlus[I13, xio.XHasM13[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]],
    i14: xio.nat.has.NatReversePlus[I14, xio.XHasM14[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]],
    i15: xio.nat.has.NatReversePlus[I15, xio.XHasM15[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]],
    i16: xio.nat.has.NatReversePlus[I16, xio.XHasM16[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]],
    i17: xio.nat.has.NatReversePlus[I17, xio.XHasM17[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]],
    i18: xio.nat.has.NatReversePlus[I18, xio.XHasM18[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]],
    i19: xio.nat.has.NatReversePlus[I19, xio.XHasM19[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]],
    i20: xio.nat.has.NatReversePlus[I20, xio.XHasM20[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]],
    i21: xio.nat.has.NatReversePlus[I21, xio.XHasM21[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]],
    i22: xio.nat.has.NatReversePlus[I22, xio.XHasM22[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21]]
  ): xio.XHasM2[xio.XHasM22[I, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21], I22] => I =
    i => take1Plus21(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21)(i22.takeHead(i))
}
