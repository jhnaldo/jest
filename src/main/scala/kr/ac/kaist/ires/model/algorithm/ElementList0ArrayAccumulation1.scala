package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ElementList0ArrayAccumulation1 extends Algorithm {
  val name: String = "ElementList0ArrayAccumulation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ElementList0ArrayAccumulation1" (this, Elision, AssignmentExpression, array, nextIndex) => {
    if (= Elision absent) let padding = 0i else {
      access __x0__ = (Elision "ElisionWidth")
      let padding = __x0__
    }
    access __x1__ = (AssignmentExpression "Evaluation")
    let initResult = __x1__
    app __x2__ = (GetValue initResult)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let initValue = __x2__
    app __x3__ = (ToUint32 (+ nextIndex padding))
    app __x4__ = (ToString __x3__)
    app __x5__ = (CreateDataProperty array __x4__ initValue)
    let created = __x5__
    assert (= created true)
    app __x6__ = (WrapCompletion (+ (+ nextIndex padding) 1i))
    return __x6__
  }"""), this)
}
