package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionDeclaration0InstantiateFunctionObject0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AsyncFunctionDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody, scope) => {
    if true let strict = true else let strict = false
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    app __x1__ = (AsyncFunctionCreate CONST_Normal FormalParameters AsyncFunctionBody scope strict)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let F = __x1__
    app __x2__ = (SetFunctionName F name)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    F["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion F)
    return __x3__
  }""")
}
