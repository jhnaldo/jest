package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object thisBooleanValue extends Algorithm {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = parseFunc(""""thisBooleanValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ Boolean) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["BooleanData"] absent))) {
      let b = value["BooleanData"]
      app __x3__ = (Type b)
      assert (= __x3__ Boolean)
      app __x4__ = (WrapCompletion b)
      return __x4__
    } else {}
    app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x5__
  }""")
}
