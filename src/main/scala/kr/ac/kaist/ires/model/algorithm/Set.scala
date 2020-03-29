package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Set {
  val length: Int = 4
  val func: Func = parseFunc(""""Set" (O, P, V, Throw) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    app __x1__ = (IsPropertyKey P)
    assert (= __x1__ true)
    app __x2__ = (Type Throw)
    assert (= __x2__ Boolean)
    app __x3__ = (O["Set"] O P V O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let success = __x3__
    if (&& (= success false) (= Throw true)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion success)
    return __x5__
  }""")
}
