package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgumentList2ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""ArgumentList2ArgumentListEvaluation0" (this, ArgumentList, AssignmentExpression) => {
    access __x0__ = (ArgumentList "ArgumentListEvaluation")
    let precedingArgs = __x0__
    if (is-completion precedingArgs) if (= precedingArgs["Type"] CONST_normal) precedingArgs = precedingArgs["Value"] else return precedingArgs else {}
    precedingArgs
    access __x1__ = (AssignmentExpression "Evaluation")
    let ref = __x1__
    app __x2__ = (GetValue ref)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let arg = __x2__
    append arg -> precedingArgs
    app __x3__ = (WrapCompletion precedingArgs)
    return __x3__
  }""")
}
