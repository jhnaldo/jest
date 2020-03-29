package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateSetIterator {
  val length: Int = 2
  val func: Func = parseFunc(""""CreateSetIterator" (set, kind) => {
    app __x0__ = (RequireInternalSlot set "SetData")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (ObjectCreate INTRINSIC_SetIteratorPrototype (new ["IteratedSet", "SetNextIndex", "SetIterationKind"]))
    let iterator = __x1__
    iterator["IteratedSet"] = set
    iterator["SetNextIndex"] = 0i
    iterator["SetIterationKind"] = kind
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }""")
}
