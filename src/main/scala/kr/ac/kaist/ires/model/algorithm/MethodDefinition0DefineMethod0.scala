package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition0DefineMethod0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MethodDefinition0DefineMethod0" (this, PropertyName, UniqueFormalParameters, FunctionBody, object, functionPrototype) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (is-completion propKey) if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    if true let strict = true else let strict = false
    let scope = GLOBAL_context["LexicalEnvironment"]
    if (! (= functionPrototype absent)) {
      let kind = CONST_Normal
      let prototype = functionPrototype
    } else {
      let kind = CONST_Method
      let prototype = INTRINSIC_FunctionPrototype
    }
    app __x1__ = (FunctionCreate kind UniqueFormalParameters FunctionBody scope strict prototype)
    let closure = __x1__
    app __x2__ = (MakeMethod closure object)
    __x2__
    closure["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion (new Record("Key" -> propKey, "Closure" -> closure)))
    return __x3__
  }"""))
}
