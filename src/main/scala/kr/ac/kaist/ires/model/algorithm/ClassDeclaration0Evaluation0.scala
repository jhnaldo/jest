package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassDeclaration0Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""ClassDeclaration0Evaluation0" (this, BindingIdentifier, ClassTail) => {
    access __x0__ = (this "BindingClassDeclarationEvaluation")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (NormalCompletion CONST_empty)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
