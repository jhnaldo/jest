package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorDeclaration0InstantiateFunctionObject0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AsyncGeneratorDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody, scope) => {
    if true let strict = true else let strict = false
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    app __x1__ = (AsyncGeneratorFunctionCreate CONST_Normal FormalParameters AsyncGeneratorBody scope strict)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let F = __x1__
    app __x2__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let prototype = __x2__
    app __x3__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (SetFunctionName F name)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    __x4__
    F["SourceText"] = (get-syntax this)
    app __x5__ = (WrapCompletion F)
    return __x5__
  }""")
}
