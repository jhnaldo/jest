package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LogicalORExpression1Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""LogicalORExpression1Evaluation0" (this, LogicalORExpression, LogicalANDExpression) => {
    access __x0__ = (LogicalORExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    app __x2__ = (ToBoolean lval)
    let lbool = __x2__
    if (= lbool true) {
      app __x3__ = (WrapCompletion lval)
      return __x3__
    } else {}
    access __x4__ = (LogicalANDExpression "Evaluation")
    let rref = __x4__
    app __x5__ = (GetValue rref)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }""")
}
