package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptEvaluationJob extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""ScriptEvaluationJob" (sourceText, hostDefined) => {
    let realm = REALM
    app __x0__ = (ParseScript sourceText realm hostDefined)
    let s = __x0__
    app __x1__ = (ScriptEvaluation s)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
