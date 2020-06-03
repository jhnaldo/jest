package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2Evaluation0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""TryStatement2Evaluation0" (this, Block, Catch, Finally) => {
    access __x0__ = (Block "Evaluation")
    let B = __x0__
    if (= B["Type"] CONST_throw) {
      access __x1__ = (Catch "CatchClauseEvaluation")
      app __x2__ = (__x1__ B["Value"])
      let C = __x2__
    } else let C = B
    access __x3__ = (Finally "Evaluation")
    let F = __x3__
    if (= F["Type"] CONST_normal) F = C else {}
    app __x4__ = (UpdateEmpty F undefined)
    app __x5__ = (Completion __x4__)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }""")
}
