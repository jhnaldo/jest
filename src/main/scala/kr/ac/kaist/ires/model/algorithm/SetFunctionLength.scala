package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetFunctionLength {
  val length: Int = 2
  val func: Func = parseFunc(""""SetFunctionLength" (F, length) => {
    app __x0__ = (Type length)
    assert (= __x0__ Number)
    let __x1__ = (! (< length 0i))
    if __x1__ {
      app __x2__ = (IsInteger length)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x1__ = (= __x2__ true)
    } else {}
    assert __x1__
    app __x3__ = (DefinePropertyOrThrow F "length" (new PropertyDescriptor("Value" -> length, "Writable" -> false, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }""")
}
