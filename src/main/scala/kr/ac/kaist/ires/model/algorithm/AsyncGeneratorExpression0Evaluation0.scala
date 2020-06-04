package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorExpression0Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AsyncGeneratorExpression0Evaluation0" (this, FormalParameters, AsyncGeneratorBody) => {
    if true let strict = true else let strict = false
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (AsyncGeneratorFunctionCreate CONST_Normal FormalParameters AsyncGeneratorBody scope strict)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let closure = __x1__
    app __x2__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let prototype = __x2__
    app __x3__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    closure["SourceText"] = (get-syntax this)
    app __x4__ = (WrapCompletion closure)
    return __x4__
  }""")
}
