package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorMethod0PropertyDefinitionEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""GeneratorMethod0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, GeneratorBody, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (is-completion propKey) if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    if true let strict = true else let strict = false
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x1__ = (GeneratorFunctionCreate CONST_Method UniqueFormalParameters GeneratorBody scope strict)
    let closure = __x1__
    app __x2__ = (MakeMethod closure object)
    __x2__
    app __x3__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
    let prototype = __x3__
    app __x4__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x4__
    app __x5__ = (SetFunctionName closure propKey)
    __x5__
    closure["SourceText"] = (get-syntax this)
    let desc = (new PropertyDescriptor("Value" -> closure, "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x6__ = (DefinePropertyOrThrow object propKey desc)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }""")
}
