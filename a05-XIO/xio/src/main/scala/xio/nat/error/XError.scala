package xio
trait XErrorAlias {
    type XError0 = nat.error.NatEitherZero
    type XError1[T1] = nat.error.NatEitherPositive[nat.error.NatEitherZero, T1]
        type XError2[  T1   ,  T2 ] = nat.error.NatEitherPositive[XError1[  T1 ], T2]
        type XError3[  T1   ,  T2   ,  T3 ] = nat.error.NatEitherPositive[XError2[  T1   ,  T2 ], T3]
        type XError4[  T1   ,  T2   ,  T3   ,  T4 ] = nat.error.NatEitherPositive[XError3[  T1   ,  T2   ,  T3 ], T4]
        type XError5[  T1   ,  T2   ,  T3   ,  T4   ,  T5 ] = nat.error.NatEitherPositive[XError4[  T1   ,  T2   ,  T3   ,  T4 ], T5]
        type XError6[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6 ] = nat.error.NatEitherPositive[XError5[  T1   ,  T2   ,  T3   ,  T4   ,  T5 ], T6]
        type XError7[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7 ] = nat.error.NatEitherPositive[XError6[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6 ], T7]
        type XError8[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8 ] = nat.error.NatEitherPositive[XError7[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7 ], T8]
        type XError9[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9 ] = nat.error.NatEitherPositive[XError8[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8 ], T9]
        type XError10[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10 ] = nat.error.NatEitherPositive[XError9[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9 ], T10]
        type XError11[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11 ] = nat.error.NatEitherPositive[XError10[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10 ], T11]
        type XError12[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12 ] = nat.error.NatEitherPositive[XError11[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11 ], T12]
        type XError13[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13 ] = nat.error.NatEitherPositive[XError12[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12 ], T13]
        type XError14[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14 ] = nat.error.NatEitherPositive[XError13[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13 ], T14]
        type XError15[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15 ] = nat.error.NatEitherPositive[XError14[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14 ], T15]
        type XError16[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16 ] = nat.error.NatEitherPositive[XError15[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15 ], T16]
        type XError17[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17 ] = nat.error.NatEitherPositive[XError16[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16 ], T17]
        type XError18[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18 ] = nat.error.NatEitherPositive[XError17[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17 ], T18]
        type XError19[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19 ] = nat.error.NatEitherPositive[XError18[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18 ], T19]
        type XError20[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19   ,  T20 ] = nat.error.NatEitherPositive[XError19[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19 ], T20]
        type XError21[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19   ,  T20   ,  T21 ] = nat.error.NatEitherPositive[XError20[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19   ,  T20 ], T21]
        type XError22[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19   ,  T20   ,  T21   ,  T22 ] = nat.error.NatEitherPositive[XError21[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19   ,  T20   ,  T21 ], T22]
}
