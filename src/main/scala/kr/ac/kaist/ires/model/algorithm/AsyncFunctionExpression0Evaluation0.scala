package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""AsyncFunctionExpression0Evaluation0" (this, FormalParameters, AsyncFunctionBody) => {
    if true let strict = true else let strict = false
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (AsyncFunctionCreate CONST_Normal FormalParameters AsyncFunctionBody scope strict)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let closure = __x1__
    closure["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }""")
}
