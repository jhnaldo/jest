package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ConditionalExpression1HasCallInTailPosition0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ConditionalExpression1HasCallInTailPosition0" (this, LogicalORExpression, AssignmentExpression0, AssignmentExpression1, call) => {
    access __x0__ = (AssignmentExpression0 "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    let has = __x1__
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (AssignmentExpression1 "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""))
}
