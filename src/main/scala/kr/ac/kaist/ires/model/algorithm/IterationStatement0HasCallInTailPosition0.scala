package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement0HasCallInTailPosition0 {
  val length: Int = 0
  val func: Func = parseFunc(""""IterationStatement0HasCallInTailPosition0" (this, Statement, Expression, call) => {
    access __x0__ = (Statement "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}