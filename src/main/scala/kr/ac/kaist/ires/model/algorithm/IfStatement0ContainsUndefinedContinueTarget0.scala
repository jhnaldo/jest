package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IfStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = parseFunc(""""IfStatement0ContainsUndefinedContinueTarget0" (this, Expression, Statement0, Statement1, iterationSet, labelSet) => {
    access __x0__ = (Statement0 "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Statement1 "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    return __x3__
  }""")
}
