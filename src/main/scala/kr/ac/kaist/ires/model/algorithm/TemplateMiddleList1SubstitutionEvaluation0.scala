package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateMiddleList1SubstitutionEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""TemplateMiddleList1SubstitutionEvaluation0" (this, TemplateMiddleList, TemplateMiddle, Expression) => {
    access __x0__ = (TemplateMiddleList "SubstitutionEvaluation")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let preceding = __x0__
    access __x1__ = (Expression "Evaluation")
    let nextRef = __x1__
    app __x2__ = (GetValue nextRef)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let next = __x2__
    append next -> preceding
    app __x3__ = (WrapCompletion preceding)
    return __x3__
  }""")
}
