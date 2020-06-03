package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryCreateFromConstructor {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""OrdinaryCreateFromConstructor" (constructor, intrinsicDefaultProto, internalSlotsList) => {
    app __x0__ = (GetPrototypeFromConstructor constructor intrinsicDefaultProto)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let proto = __x0__
    app __x1__ = (ObjectCreate proto internalSlotsList)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
