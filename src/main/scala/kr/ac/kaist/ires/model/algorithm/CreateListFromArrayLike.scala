package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateListFromArrayLike {
  val length: Int = 1
  val func: Func = parseFunc(""""CreateListFromArrayLike" (obj, elementTypes) => {
    if (= elementTypes absent) elementTypes = (new [Undefined, Null, Boolean, String, Symbol, Number, Object]) else {}
    app __x0__ = (Type obj)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (LengthOfArrayLike obj)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let len = __x2__
    let list = (new [])
    let index = 0i
    while (< index len) {
      app __x3__ = (ToString index)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let indexName = __x3__
      app __x4__ = (Get obj indexName)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let next = __x4__
      app __x5__ = (Type next)
      if (! (contains elementTypes __x5__)) {
        app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x6__
      } else {}
      append next -> list
      index = (+ index 1i)
    }
    app __x7__ = (WrapCompletion list)
    return __x7__
  }""")
}
