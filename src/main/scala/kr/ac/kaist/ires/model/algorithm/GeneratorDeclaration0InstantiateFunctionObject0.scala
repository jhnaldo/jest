package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorDeclaration0InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = parseFunc(""""GeneratorDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, GeneratorBody, scope) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    app __x1__ = (GeneratorFunctionCreate CONST_Normal FormalParameters GeneratorBody scope)
    let F = __x1__
    app __x2__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
    let prototype = __x2__
    app __x3__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x3__
    app __x4__ = (SetFunctionName F name)
    __x4__
    F["SourceText"] = (get-syntax this)
    app __x5__ = (WrapCompletion F)
    return __x5__
  }""")
}
