package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorExpression0Evaluation1 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AsyncGeneratorExpression0Evaluation1" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody) => {
    if true let strict = true else let strict = false
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment scope)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let funcEnv = __x0__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x1__ = (BindingIdentifier "StringValue")
    let name = __x1__
    app __x2__ = (envRec["CreateImmutableBinding"] envRec name)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (AsyncGeneratorFunctionCreate CONST_Normal FormalParameters AsyncGeneratorBody funcEnv strict)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let closure = __x3__
    app __x4__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let prototype = __x4__
    app __x5__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (SetFunctionName closure name)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    __x6__
    app __x7__ = (envRec["InitializeBinding"] envRec name closure)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    __x7__
    closure["SourceText"] = (get-syntax this)
    app __x8__ = (WrapCompletion closure)
    return __x8__
  }""")
}
