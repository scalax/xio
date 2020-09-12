package xio.helper
object XIOErrorHelperInstance {
  trait MatchAll1Apply1[P <: xio.nat.error.NatEither, E1, Input <: xio.nat.has.Nat, Out] {
    def input1[Out1 <: Out, Input1 <: xio.nat.has.Nat](e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1])(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply2[P <: xio.nat.error.NatEither, E1, E2, Input <: xio.nat.has.Nat, Out] {
    def input2[Out1 <: Out, Input1 <: xio.nat.has.Nat, Out2 <: Out, Input2 <: xio.nat.has.Nat](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2]
    )(implicit natToTag1: xio.nat.has.NatToTag[Input1, Input], natToTag2: xio.nat.has.NatToTag[Input2, Input]): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply3[P <: xio.nat.error.NatEither, E1, E2, E3, Input <: xio.nat.has.Nat, Out] {
    def input3[Out1 <: Out, Input1 <: xio.nat.has.Nat, Out2 <: Out, Input2 <: xio.nat.has.Nat, Out3 <: Out, Input3 <: xio.nat.has.Nat](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply4[P <: xio.nat.error.NatEither, E1, E2, E3, E4, Input <: xio.nat.has.Nat, Out] {
    def input4[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply5[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, Input <: xio.nat.has.Nat, Out] {
    def input5[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply6[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, Input <: xio.nat.has.Nat, Out] {
    def input6[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply7[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, Input <: xio.nat.has.Nat, Out] {
    def input7[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply8[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, Input <: xio.nat.has.Nat, Out] {
    def input8[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply9[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, Input <: xio.nat.has.Nat, Out] {
    def input9[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply10[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, Input <: xio.nat.has.Nat, Out] {
    def input10[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply11[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, Input <: xio.nat.has.Nat, Out] {
    def input11[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply12[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, Input <: xio.nat.has.Nat, Out] {
    def input12[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply13[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, Input <: xio.nat.has.Nat, Out] {
    def input13[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input],
      natToTag13: xio.nat.has.NatToTag[Input13, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply14[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, Input <: xio.nat.has.Nat, Out] {
    def input14[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input],
      natToTag13: xio.nat.has.NatToTag[Input13, Input],
      natToTag14: xio.nat.has.NatToTag[Input14, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply15[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, Input <: xio.nat.has.Nat, Out] {
    def input15[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input],
      natToTag13: xio.nat.has.NatToTag[Input13, Input],
      natToTag14: xio.nat.has.NatToTag[Input14, Input],
      natToTag15: xio.nat.has.NatToTag[Input15, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply16[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, Input <: xio.nat.has.Nat, Out] {
    def input16[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input],
      natToTag13: xio.nat.has.NatToTag[Input13, Input],
      natToTag14: xio.nat.has.NatToTag[Input14, Input],
      natToTag15: xio.nat.has.NatToTag[Input15, Input],
      natToTag16: xio.nat.has.NatToTag[Input16, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply17[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, Input <: xio.nat.has.Nat, Out] {
    def input17[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input],
      natToTag13: xio.nat.has.NatToTag[Input13, Input],
      natToTag14: xio.nat.has.NatToTag[Input14, Input],
      natToTag15: xio.nat.has.NatToTag[Input15, Input],
      natToTag16: xio.nat.has.NatToTag[Input16, Input],
      natToTag17: xio.nat.has.NatToTag[Input17, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply18[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, Input <: xio.nat.has.Nat, Out] {
    def input18[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat,
      Out18 <: Out,
      Input18 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input],
      natToTag13: xio.nat.has.NatToTag[Input13, Input],
      natToTag14: xio.nat.has.NatToTag[Input14, Input],
      natToTag15: xio.nat.has.NatToTag[Input15, Input],
      natToTag16: xio.nat.has.NatToTag[Input16, Input],
      natToTag17: xio.nat.has.NatToTag[Input17, Input],
      natToTag18: xio.nat.has.NatToTag[Input18, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply19[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    Input <: xio.nat.has.Nat,
    Out
  ] {
    def input19[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat,
      Out18 <: Out,
      Input18 <: xio.nat.has.Nat,
      Out19 <: Out,
      Input19 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input],
      natToTag13: xio.nat.has.NatToTag[Input13, Input],
      natToTag14: xio.nat.has.NatToTag[Input14, Input],
      natToTag15: xio.nat.has.NatToTag[Input15, Input],
      natToTag16: xio.nat.has.NatToTag[Input16, Input],
      natToTag17: xio.nat.has.NatToTag[Input17, Input],
      natToTag18: xio.nat.has.NatToTag[Input18, Input],
      natToTag19: xio.nat.has.NatToTag[Input19, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply20[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    Input <: xio.nat.has.Nat,
    Out
  ] {
    def input20[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat,
      Out18 <: Out,
      Input18 <: xio.nat.has.Nat,
      Out19 <: Out,
      Input19 <: xio.nat.has.Nat,
      Out20 <: Out,
      Input20 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
      e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input],
      natToTag13: xio.nat.has.NatToTag[Input13, Input],
      natToTag14: xio.nat.has.NatToTag[Input14, Input],
      natToTag15: xio.nat.has.NatToTag[Input15, Input],
      natToTag16: xio.nat.has.NatToTag[Input16, Input],
      natToTag17: xio.nat.has.NatToTag[Input17, Input],
      natToTag18: xio.nat.has.NatToTag[Input18, Input],
      natToTag19: xio.nat.has.NatToTag[Input19, Input],
      natToTag20: xio.nat.has.NatToTag[Input20, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply21[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    E21,
    Input <: xio.nat.has.Nat,
    Out
  ] {
    def input21[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat,
      Out18 <: Out,
      Input18 <: xio.nat.has.Nat,
      Out19 <: Out,
      Input19 <: xio.nat.has.Nat,
      Out20 <: Out,
      Input20 <: xio.nat.has.Nat,
      Out21 <: Out,
      Input21 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
      e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20],
      e21: xio.ErrorContent[E21, P] => xio.XIO[Input21, P, Out21]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input],
      natToTag13: xio.nat.has.NatToTag[Input13, Input],
      natToTag14: xio.nat.has.NatToTag[Input14, Input],
      natToTag15: xio.nat.has.NatToTag[Input15, Input],
      natToTag16: xio.nat.has.NatToTag[Input16, Input],
      natToTag17: xio.nat.has.NatToTag[Input17, Input],
      natToTag18: xio.nat.has.NatToTag[Input18, Input],
      natToTag19: xio.nat.has.NatToTag[Input19, Input],
      natToTag20: xio.nat.has.NatToTag[Input20, Input],
      natToTag21: xio.nat.has.NatToTag[Input21, Input]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply22[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    E21,
    E22,
    Input <: xio.nat.has.Nat,
    Out
  ] {
    def input22[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat,
      Out18 <: Out,
      Input18 <: xio.nat.has.Nat,
      Out19 <: Out,
      Input19 <: xio.nat.has.Nat,
      Out20 <: Out,
      Input20 <: xio.nat.has.Nat,
      Out21 <: Out,
      Input21 <: xio.nat.has.Nat,
      Out22 <: Out,
      Input22 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
      e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20],
      e21: xio.ErrorContent[E21, P] => xio.XIO[Input21, P, Out21],
      e22: xio.ErrorContent[E22, P] => xio.XIO[Input22, P, Out22]
    )(implicit
      natToTag1: xio.nat.has.NatToTag[Input1, Input],
      natToTag2: xio.nat.has.NatToTag[Input2, Input],
      natToTag3: xio.nat.has.NatToTag[Input3, Input],
      natToTag4: xio.nat.has.NatToTag[Input4, Input],
      natToTag5: xio.nat.has.NatToTag[Input5, Input],
      natToTag6: xio.nat.has.NatToTag[Input6, Input],
      natToTag7: xio.nat.has.NatToTag[Input7, Input],
      natToTag8: xio.nat.has.NatToTag[Input8, Input],
      natToTag9: xio.nat.has.NatToTag[Input9, Input],
      natToTag10: xio.nat.has.NatToTag[Input10, Input],
      natToTag11: xio.nat.has.NatToTag[Input11, Input],
      natToTag12: xio.nat.has.NatToTag[Input12, Input],
      natToTag13: xio.nat.has.NatToTag[Input13, Input],
      natToTag14: xio.nat.has.NatToTag[Input14, Input],
      natToTag15: xio.nat.has.NatToTag[Input15, Input],
      natToTag16: xio.nat.has.NatToTag[Input16, Input],
      natToTag17: xio.nat.has.NatToTag[Input17, Input],
      natToTag18: xio.nat.has.NatToTag[Input18, Input],
      natToTag19: xio.nat.has.NatToTag[Input19, Input],
      natToTag20: xio.nat.has.NatToTag[Input20, Input],
      natToTag21: xio.nat.has.NatToTag[Input21, Input],
      natToTag22: xio.nat.has.NatToTag[Input22, Input]
    ): xio.XIO[Input, P, Out]
  }
  def errorCompat1[P <: xio.nat.error.NatEither, E1, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    u: xio.XError1[E1]
  ): xio.XIO[Input, P, Out] = e1(new xio.ErrorContentImpl(u.sureRight))
  def errorCompat2[P <: xio.nat.error.NatEither, E1, E2, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    u: xio.XError2[E1, E2]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat1(e1, ii1), ii2 => e2(new xio.ErrorContentImpl(ii2)))
  def errorCompat3[P <: xio.nat.error.NatEither, E1, E2, E3, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    u: xio.XError3[E1, E2, E3]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat2(e1, e2, ii1), ii2 => e3(new xio.ErrorContentImpl(ii2)))
  def errorCompat4[P <: xio.nat.error.NatEither, E1, E2, E3, E4, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    u: xio.XError4[E1, E2, E3, E4]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat3(e1, e2, e3, ii1), ii2 => e4(new xio.ErrorContentImpl(ii2)))
  def errorCompat5[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    u: xio.XError5[E1, E2, E3, E4, E5]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat4(e1, e2, e3, e4, ii1), ii2 => e5(new xio.ErrorContentImpl(ii2)))
  def errorCompat6[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    u: xio.XError6[E1, E2, E3, E4, E5, E6]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat5(e1, e2, e3, e4, e5, ii1), ii2 => e6(new xio.ErrorContentImpl(ii2)))
  def errorCompat7[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    u: xio.XError7[E1, E2, E3, E4, E5, E6, E7]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat6(e1, e2, e3, e4, e5, e6, ii1), ii2 => e7(new xio.ErrorContentImpl(ii2)))
  def errorCompat8[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    u: xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat7(e1, e2, e3, e4, e5, e6, e7, ii1), ii2 => e8(new xio.ErrorContentImpl(ii2)))
  def errorCompat9[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    u: xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat8(e1, e2, e3, e4, e5, e6, e7, e8, ii1), ii2 => e9(new xio.ErrorContentImpl(ii2)))
  def errorCompat10[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    u: xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat9(e1, e2, e3, e4, e5, e6, e7, e8, e9, ii1), ii2 => e10(new xio.ErrorContentImpl(ii2)))
  def errorCompat11[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    u: xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat10(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, ii1), ii2 => e11(new xio.ErrorContentImpl(ii2)))
  def errorCompat12[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    u: xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat11(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, ii1), ii2 => e12(new xio.ErrorContentImpl(ii2)))
  def errorCompat13[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    u: xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat12(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, ii1), ii2 => e13(new xio.ErrorContentImpl(ii2)))
  def errorCompat14[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    u: xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat13(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, ii1), ii2 => e14(new xio.ErrorContentImpl(ii2)))
  def errorCompat15[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    u: xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat14(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, ii1), ii2 => e15(new xio.ErrorContentImpl(ii2)))
  def errorCompat16[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    u: xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat15(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, ii1), ii2 => e16(new xio.ErrorContentImpl(ii2)))
  def errorCompat17[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    u: xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat16(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, ii1), ii2 => e17(new xio.ErrorContentImpl(ii2)))
  def errorCompat18[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input, P, Out],
    u: xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat17(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, ii1), ii2 => e18(new xio.ErrorContentImpl(ii2)))
  def errorCompat19[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input, P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input, P, Out],
    u: xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat18(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, ii1), ii2 => e19(new xio.ErrorContentImpl(ii2)))
  def errorCompat20[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input, P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input, P, Out],
    e20: xio.ErrorContent[E20, P] => xio.XIO[Input, P, Out],
    u: xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]
  ): xio.XIO[Input, P, Out] =
    u.either
      .fold(ii1 => errorCompat19(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, ii1), ii2 => e20(new xio.ErrorContentImpl(ii2)))
  def errorCompat21[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    E21,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input, P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input, P, Out],
    e20: xio.ErrorContent[E20, P] => xio.XIO[Input, P, Out],
    e21: xio.ErrorContent[E21, P] => xio.XIO[Input, P, Out],
    u: xio.XError21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(
      ii1 => errorCompat20(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, ii1),
      ii2 => e21(new xio.ErrorContentImpl(ii2))
    )
  def errorCompat22[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    E21,
    E22,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input, P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input, P, Out],
    e20: xio.ErrorContent[E20, P] => xio.XIO[Input, P, Out],
    e21: xio.ErrorContent[E21, P] => xio.XIO[Input, P, Out],
    e22: xio.ErrorContent[E22, P] => xio.XIO[Input, P, Out],
    u: xio.XError22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(
      ii1 => errorCompat21(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, ii1),
      ii2 => e22(new xio.ErrorContentImpl(ii2))
    )
}
trait XIOErrorHelper {
  implicit class XIOErrorMatchAll1ImplicitClass1[X <: xio.nat.has.Nat, E1, I](i: xio.XIO[X, xio.XError1[E1], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply1[P, E1, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply1[P, E1, X, I] {
        override def input1[Out1 <: I, Input1 <: xio.nat.has.Nat](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1]
        )(implicit natToTag1: xio.nat.has.NatToTag[Input1, X]): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat1(e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))), ii)
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass2[X <: xio.nat.has.Nat, E1, E2, I](i: xio.XIO[X, xio.XError2[E1, E2], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply2[P, E1, E2, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply2[P, E1, E2, X, I] {
        override def input2[Out1 <: I, Input1 <: xio.nat.has.Nat, Out2 <: I, Input2 <: xio.nat.has.Nat](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2]
        )(implicit natToTag1: xio.nat.has.NatToTag[Input1, X], natToTag2: xio.nat.has.NatToTag[Input2, X]): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat2(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass3[X <: xio.nat.has.Nat, E1, E2, E3, I](i: xio.XIO[X, xio.XError3[E1, E2, E3], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply3[P, E1, E2, E3, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply3[P, E1, E2, E3, X, I] {
        override def input3[Out1 <: I, Input1 <: xio.nat.has.Nat, Out2 <: I, Input2 <: xio.nat.has.Nat, Out3 <: I, Input3 <: xio.nat.has.Nat](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3]
        )(implicit natToTag1: xio.nat.has.NatToTag[Input1, X], natToTag2: xio.nat.has.NatToTag[Input2, X], natToTag3: xio.nat.has.NatToTag[Input3, X]): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat3(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass4[X <: xio.nat.has.Nat, E1, E2, E3, E4, I](i: xio.XIO[X, xio.XError4[E1, E2, E3, E4], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply4[P, E1, E2, E3, E4, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply4[P, E1, E2, E3, E4, X, I] {
        override def input4[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat4(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass5[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, I](i: xio.XIO[X, xio.XError5[E1, E2, E3, E4, E5], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply5[P, E1, E2, E3, E4, E5, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply5[P, E1, E2, E3, E4, E5, X, I] {
        override def input5[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat5(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass6[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, I](i: xio.XIO[X, xio.XError6[E1, E2, E3, E4, E5, E6], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, X, I] {
        override def input6[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat6(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass7[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, I](i: xio.XIO[X, xio.XError7[E1, E2, E3, E4, E5, E6, E7], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, X, I] {
        override def input7[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat7(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass8[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, I](i: xio.XIO[X, xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, X, I] {
        override def input8[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat8(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass9[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, I](
    i: xio.XIO[X, xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, X, I] {
        override def input9[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat9(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass10[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, I](
    i: xio.XIO[X, xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, X, I] {
        override def input10[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat10(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass11[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, I](
    i: xio.XIO[X, xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, X, I] {
        override def input11[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat11(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass12[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, I](
    i: xio.XIO[X, xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, X, I] {
        override def input12[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat12(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass13[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, I](
    i: xio.XIO[X, xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, X, I] {
        override def input13[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
          e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X],
          natToTag13: xio.nat.has.NatToTag[Input13, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat13(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag13.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass14[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, I](
    i: xio.XIO[X, xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, X, I] {
        override def input14[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
          e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
          e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X],
          natToTag13: xio.nat.has.NatToTag[Input13, X],
          natToTag14: xio.nat.has.NatToTag[Input14, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat14(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag13.tag))),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag14.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass15[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, I](
    i: xio.XIO[X, xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, X, I] {
        override def input15[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
          e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
          e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
          e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X],
          natToTag13: xio.nat.has.NatToTag[Input13, X],
          natToTag14: xio.nat.has.NatToTag[Input14, X],
          natToTag15: xio.nat.has.NatToTag[Input15, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat15(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag13.tag))),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag14.tag))),
              e15.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag15.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass16[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, I](
    i: xio.XIO[X, xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, X, I] {
        override def input16[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
          e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
          e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
          e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
          e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X],
          natToTag13: xio.nat.has.NatToTag[Input13, X],
          natToTag14: xio.nat.has.NatToTag[Input14, X],
          natToTag15: xio.nat.has.NatToTag[Input15, X],
          natToTag16: xio.nat.has.NatToTag[Input16, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat16(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag13.tag))),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag14.tag))),
              e15.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag15.tag))),
              e16.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag16.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass17[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, I](
    i: xio.XIO[X, xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, X, I] {
        override def input17[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
          e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
          e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
          e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
          e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
          e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X],
          natToTag13: xio.nat.has.NatToTag[Input13, X],
          natToTag14: xio.nat.has.NatToTag[Input14, X],
          natToTag15: xio.nat.has.NatToTag[Input15, X],
          natToTag16: xio.nat.has.NatToTag[Input16, X],
          natToTag17: xio.nat.has.NatToTag[Input17, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat17(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag13.tag))),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag14.tag))),
              e15.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag15.tag))),
              e16.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag16.tag))),
              e17.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag17.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass18[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, I](
    i: xio.XIO[X, xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, X, I] {
        override def input18[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat,
          Out18 <: I,
          Input18 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
          e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
          e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
          e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
          e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
          e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
          e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X],
          natToTag13: xio.nat.has.NatToTag[Input13, X],
          natToTag14: xio.nat.has.NatToTag[Input14, X],
          natToTag15: xio.nat.has.NatToTag[Input15, X],
          natToTag16: xio.nat.has.NatToTag[Input16, X],
          natToTag17: xio.nat.has.NatToTag[Input17, X],
          natToTag18: xio.nat.has.NatToTag[Input18, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat18(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag13.tag))),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag14.tag))),
              e15.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag15.tag))),
              e16.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag16.tag))),
              e17.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag17.tag))),
              e18.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag18.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass19[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, I](
    i: xio.XIO[X, xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, X, I] {
        override def input19[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat,
          Out18 <: I,
          Input18 <: xio.nat.has.Nat,
          Out19 <: I,
          Input19 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
          e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
          e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
          e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
          e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
          e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
          e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
          e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X],
          natToTag13: xio.nat.has.NatToTag[Input13, X],
          natToTag14: xio.nat.has.NatToTag[Input14, X],
          natToTag15: xio.nat.has.NatToTag[Input15, X],
          natToTag16: xio.nat.has.NatToTag[Input16, X],
          natToTag17: xio.nat.has.NatToTag[Input17, X],
          natToTag18: xio.nat.has.NatToTag[Input18, X],
          natToTag19: xio.nat.has.NatToTag[Input19, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat19(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag13.tag))),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag14.tag))),
              e15.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag15.tag))),
              e16.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag16.tag))),
              e17.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag17.tag))),
              e18.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag18.tag))),
              e19.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag19.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass20[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, I](
    i: xio.XIO[X, xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, X, I] {
        override def input20[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat,
          Out18 <: I,
          Input18 <: xio.nat.has.Nat,
          Out19 <: I,
          Input19 <: xio.nat.has.Nat,
          Out20 <: I,
          Input20 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
          e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
          e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
          e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
          e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
          e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
          e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
          e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
          e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X],
          natToTag13: xio.nat.has.NatToTag[Input13, X],
          natToTag14: xio.nat.has.NatToTag[Input14, X],
          natToTag15: xio.nat.has.NatToTag[Input15, X],
          natToTag16: xio.nat.has.NatToTag[Input16, X],
          natToTag17: xio.nat.has.NatToTag[Input17, X],
          natToTag18: xio.nat.has.NatToTag[Input18, X],
          natToTag19: xio.nat.has.NatToTag[Input19, X],
          natToTag20: xio.nat.has.NatToTag[Input20, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat20(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag13.tag))),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag14.tag))),
              e15.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag15.tag))),
              e16.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag16.tag))),
              e17.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag17.tag))),
              e18.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag18.tag))),
              e19.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag19.tag))),
              e20.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag20.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass21[
    X <: xio.nat.has.Nat,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    E21,
    I
  ](i: xio.XIO[X, xio.XError21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, X, I] {
        override def input21[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat,
          Out18 <: I,
          Input18 <: xio.nat.has.Nat,
          Out19 <: I,
          Input19 <: xio.nat.has.Nat,
          Out20 <: I,
          Input20 <: xio.nat.has.Nat,
          Out21 <: I,
          Input21 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
          e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
          e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
          e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
          e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
          e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
          e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
          e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
          e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20],
          e21: xio.ErrorContent[E21, P] => xio.XIO[Input21, P, Out21]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X],
          natToTag13: xio.nat.has.NatToTag[Input13, X],
          natToTag14: xio.nat.has.NatToTag[Input14, X],
          natToTag15: xio.nat.has.NatToTag[Input15, X],
          natToTag16: xio.nat.has.NatToTag[Input16, X],
          natToTag17: xio.nat.has.NatToTag[Input17, X],
          natToTag18: xio.nat.has.NatToTag[Input18, X],
          natToTag19: xio.nat.has.NatToTag[Input19, X],
          natToTag20: xio.nat.has.NatToTag[Input20, X],
          natToTag21: xio.nat.has.NatToTag[Input21, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat21(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag13.tag))),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag14.tag))),
              e15.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag15.tag))),
              e16.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag16.tag))),
              e17.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag17.tag))),
              e18.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag18.tag))),
              e19.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag19.tag))),
              e20.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag20.tag))),
              e21.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag21.tag))),
              ii
            )
          )
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass22[
    X <: xio.nat.has.Nat,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    E21,
    E22,
    I
  ](i: xio.XIO[X, xio.XError22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, X, I] {
        override def input22[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat,
          Out18 <: I,
          Input18 <: xio.nat.has.Nat,
          Out19 <: I,
          Input19 <: xio.nat.has.Nat,
          Out20 <: I,
          Input20 <: xio.nat.has.Nat,
          Out21 <: I,
          Input21 <: xio.nat.has.Nat,
          Out22 <: I,
          Input22 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
          e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
          e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
          e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
          e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
          e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
          e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
          e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
          e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
          e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
          e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
          e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
          e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20],
          e21: xio.ErrorContent[E21, P] => xio.XIO[Input21, P, Out21],
          e22: xio.ErrorContent[E22, P] => xio.XIO[Input22, P, Out22]
        )(implicit
          natToTag1: xio.nat.has.NatToTag[Input1, X],
          natToTag2: xio.nat.has.NatToTag[Input2, X],
          natToTag3: xio.nat.has.NatToTag[Input3, X],
          natToTag4: xio.nat.has.NatToTag[Input4, X],
          natToTag5: xio.nat.has.NatToTag[Input5, X],
          natToTag6: xio.nat.has.NatToTag[Input6, X],
          natToTag7: xio.nat.has.NatToTag[Input7, X],
          natToTag8: xio.nat.has.NatToTag[Input8, X],
          natToTag9: xio.nat.has.NatToTag[Input9, X],
          natToTag10: xio.nat.has.NatToTag[Input10, X],
          natToTag11: xio.nat.has.NatToTag[Input11, X],
          natToTag12: xio.nat.has.NatToTag[Input12, X],
          natToTag13: xio.nat.has.NatToTag[Input13, X],
          natToTag14: xio.nat.has.NatToTag[Input14, X],
          natToTag15: xio.nat.has.NatToTag[Input15, X],
          natToTag16: xio.nat.has.NatToTag[Input16, X],
          natToTag17: xio.nat.has.NatToTag[Input17, X],
          natToTag18: xio.nat.has.NatToTag[Input18, X],
          natToTag19: xio.nat.has.NatToTag[Input19, X],
          natToTag20: xio.nat.has.NatToTag[Input20, X],
          natToTag21: xio.nat.has.NatToTag[Input21, X],
          natToTag22: xio.nat.has.NatToTag[Input22, X]
        ): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i)(ii =>
            XIOErrorHelperInstance.errorCompat22(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag1.tag))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag2.tag))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag3.tag))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag4.tag))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag5.tag))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag6.tag))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag7.tag))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag8.tag))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag9.tag))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag10.tag))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag11.tag))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag12.tag))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag13.tag))),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag14.tag))),
              e15.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag15.tag))),
              e16.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag16.tag))),
              e17.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag17.tag))),
              e18.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag18.tag))),
              e19.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag19.tag))),
              e20.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag20.tag))),
              e21.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag21.tag))),
              e22.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](natToTag22.tag))),
              ii
            )
          )
      }
  }
}
