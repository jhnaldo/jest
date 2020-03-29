package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = parseFunc(""""TryStatement0ContainsUndefinedContinueTarget0" (this, Block, Catch, iterationSet, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Catch "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    return __x3__
  }""")
}
