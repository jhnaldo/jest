package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassExpression0Evaluation1 {
  val length: Int = 0
  val func: Func = parseFunc(""""ClassExpression0Evaluation1" (this, BindingIdentifier, ClassTail) => {
    if (= BindingIdentifier absent) let className = undefined else {
      access __x0__ = (BindingIdentifier "StringValue")
      let className = __x0__
    }
    access __x1__ = (ClassTail "ClassDefinitionEvaluation")
    app __x2__ = (__x1__ className className)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let value = __x2__
    value["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion value)
    return __x3__
  }""")
}
