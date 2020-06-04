package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SuperCall0Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""SuperCall0Evaluation0" (this, Arguments) => {
    app __x0__ = (GetNewTarget )
    let newTarget = __x0__
    app __x1__ = (Type newTarget)
    assert (= __x1__ Object)
    app __x2__ = (GetSuperConstructor )
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let func = __x2__
    access __x3__ = (Arguments "ArgumentListEvaluation")
    let argList = __x3__
    if (is-completion argList) if (= argList["Type"] CONST_normal) argList = argList["Value"] else return argList else {}
    argList
    app __x4__ = (Construct func argList newTarget)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let result = __x4__
    app __x5__ = (GetThisEnvironment )
    let thisER = __x5__
    app __x6__ = (thisER["BindThisValue"] thisER result)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }""")
}
