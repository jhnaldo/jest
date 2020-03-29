package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeConstructor {
  val length: Int = 1
  val func: Func = parseFunc(""""MakeConstructor" (F, writablePrototype, prototype) => {
    app __x0__ = (IsConstructor F)
    assert (= __x0__ true)
    if (= writablePrototype absent) writablePrototype = true else {}
    if (= prototype absent) {
      app __x1__ = (ObjectCreate INTRINSIC_ObjectPrototype)
      prototype = __x1__
      app __x2__ = (DefinePropertyOrThrow prototype "constructor" (new PropertyDescriptor("Value" -> F, "Writable" -> writablePrototype, "Enumerable" -> false, "Configurable" -> true)))
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
    } else {}
    app __x3__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> writablePrototype, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (NormalCompletion undefined)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }""")
}
