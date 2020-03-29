package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorMethod0PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""AsyncGeneratorMethod0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, AsyncGeneratorBody, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (is-completion propKey) if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x1__ = (AsyncGeneratorFunctionCreate CONST_Method UniqueFormalParameters AsyncGeneratorBody scope)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let closure = __x1__
    app __x2__ = (MakeMethod closure object)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let prototype = __x3__
    app __x4__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    __x4__
    app __x5__ = (SetFunctionName closure propKey)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    closure["SourceText"] = (get-syntax this)
    let desc = (new PropertyDescriptor("Value" -> closure, "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x6__ = (DefinePropertyOrThrow object propKey desc)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }""")
}
