package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionExpression0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""AsyncFunctionExpression0NamedEvaluation0" (this, FormalParameters, AsyncFunctionBody, name) => {
    access __x0__ = (this "Evaluation")
    let closure = __x0__
    app __x1__ = (SetFunctionName closure name)
    __x1__
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }""")
}
