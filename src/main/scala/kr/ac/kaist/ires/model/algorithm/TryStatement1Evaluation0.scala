package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement1Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""TryStatement1Evaluation0" (this, Block, Finally) => {
    access __x0__ = (Block "Evaluation")
    let B = __x0__
    access __x1__ = (Finally "Evaluation")
    let F = __x1__
    if (= F["Type"] CONST_normal) F = B else {}
    app __x2__ = (UpdateEmpty F undefined)
    app __x3__ = (Completion __x2__)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }""")
}
