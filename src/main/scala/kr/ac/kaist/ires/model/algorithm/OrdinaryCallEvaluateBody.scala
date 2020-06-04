package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryCallEvaluateBody extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""OrdinaryCallEvaluateBody" (F, argumentsList) => {
    access __x0__ = (F["ECMAScriptCode"] "EvaluateBody")
    app __x1__ = (__x0__ F argumentsList)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
