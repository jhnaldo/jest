package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object thisStringValue {
  val length: Int = 0
  val func: Func = parseFunc(""""thisStringValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ String) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["StringData"] absent))) {
      let s = value["StringData"]
      app __x3__ = (Type s)
      assert (= __x3__ String)
      app __x4__ = (WrapCompletion s)
      return __x4__
    } else {}
    app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x5__
  }""")
}
