package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncMethod0PropertyDefinitionEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AsyncMethod0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, AsyncFunctionBody, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (is-completion propKey) if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    if true let strict = true else let strict = false
    access __x1__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x1__
    app __x2__ = (AsyncFunctionCreate CONST_Method UniqueFormalParameters AsyncFunctionBody scope strict)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let closure = __x2__
    app __x3__ = (MakeMethod closure object)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (SetFunctionName closure propKey)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    __x4__
    closure["SourceText"] = (get-syntax this)
    let desc = (new PropertyDescriptor("Value" -> closure, "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x5__ = (DefinePropertyOrThrow object propKey desc)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }""")
}
