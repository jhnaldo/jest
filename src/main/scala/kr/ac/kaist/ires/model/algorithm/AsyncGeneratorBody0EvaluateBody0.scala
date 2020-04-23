package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorBody0EvaluateBody0 {
  val length: Int = 0
  val func: Func = parseFunc(""""AsyncGeneratorBody0EvaluateBody0" (this, FunctionBody, functionObject, argumentsList) => {
    app __x0__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (OrdinaryCreateFromConstructor functionObject INTRINSIC_AsyncGeneratorPrototype (new ["AsyncGeneratorState", "AsyncGeneratorContext", "AsyncGeneratorQueue"]))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let generator = __x1__
    app __x2__ = (AsyncGeneratorStart generator FunctionBody)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> generator, "Target" -> CONST_empty)))
    return __x3__
  }""")
}
