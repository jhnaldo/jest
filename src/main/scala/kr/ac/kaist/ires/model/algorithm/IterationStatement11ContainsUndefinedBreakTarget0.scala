package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement11ContainsUndefinedBreakTarget0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""IterationStatement11ContainsUndefinedBreakTarget0" (this, LeftHandSideExpression, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }""")
}
