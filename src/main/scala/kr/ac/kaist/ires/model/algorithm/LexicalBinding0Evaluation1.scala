package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LexicalBinding0Evaluation1 {
  val length: Int = 0
  val func: Func = parseFunc(""""LexicalBinding0Evaluation1" (this, BindingIdentifier, Initializer) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let bindingId = __x0__
    app __x1__ = (ResolveBinding bindingId)
    let lhs = __x1__
    app __x2__ = (IsAnonymousFunctionDefinition Initializer)
    if (= __x2__ true) {
      access __x3__ = (Initializer "NamedEvaluation")
      app __x4__ = (__x3__ bindingId)
      let value = __x4__
    } else {
      access __x5__ = (Initializer "Evaluation")
      let rhs = __x5__
      app __x6__ = (GetValue rhs)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let value = __x6__
    }
    app __x7__ = (InitializeReferencedBinding lhs value)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }""")
}
