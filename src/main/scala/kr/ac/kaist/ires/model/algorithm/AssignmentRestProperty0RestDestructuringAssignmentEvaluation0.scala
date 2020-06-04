package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentRestProperty0RestDestructuringAssignmentEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentRestProperty0RestDestructuringAssignmentEvaluation0" (this, DestructuringAssignmentTarget, value, excludedNames) => {
    access __x0__ = (DestructuringAssignmentTarget "Evaluation")
    let lref = __x0__
    if (is-completion lref) if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
    lref
    app __x1__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let restObj = __x1__
    app __x2__ = (CopyDataProperties restObj value excludedNames)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (PutValue lref restObj)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""))
}
