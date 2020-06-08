package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression0Evaluation0 extends Algorithm {
  val name: String = "CallExpression0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CallExpression0Evaluation0" (this, CoverCallExpressionAndAsyncArrowHead) => {
    access __x0__ = (CoverCallExpressionAndAsyncArrowHead "CoveredCallExpression")
    let expr = __x0__
    access __x1__ = (expr "MemberExpression")
    let memberExpr = __x1__
    access __x2__ = (expr "Arguments")
    let arguments = __x2__
    access __x3__ = (memberExpr "Evaluation")
    let ref = __x3__
    if (is-completion ref) if (= ref["Type"] CONST_normal) ref = ref["Value"] else return ref else {}
    ref
    app __x4__ = (GetValue ref)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let func = __x4__
    !!! "If Type ( id:{ref} ) is Reference , IsPropertyReference ( id:{ref} ) is value:{false} , and GetReferencedName ( id:{ref} ) is value:{\"eval\"} , then step-list:{...}"
    let thisCall = this
    app __x5__ = (IsInTailPosition thisCall)
    let tailCall = __x5__
    app __x6__ = (EvaluateCall func ref arguments tailCall)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""), this)
}
