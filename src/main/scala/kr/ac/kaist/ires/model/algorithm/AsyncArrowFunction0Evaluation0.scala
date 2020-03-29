package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncArrowFunction0Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""AsyncArrowFunction0Evaluation0" (this, AsyncArrowBindingIdentifier, AsyncConciseBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    let parameters = AsyncArrowBindingIdentifier
    app __x1__ = (AsyncFunctionCreate CONST_Arrow parameters AsyncConciseBody scope)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let closure = __x1__
    closure["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }""")
}
