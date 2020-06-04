package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgumentList3ArgumentListEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ArgumentList3ArgumentListEvaluation0" (this, ArgumentList, AssignmentExpression) => {
    access __x0__ = (ArgumentList "ArgumentListEvaluation")
    let precedingArgs = __x0__
    if (is-completion precedingArgs) if (= precedingArgs["Type"] CONST_normal) precedingArgs = precedingArgs["Value"] else return precedingArgs else {}
    precedingArgs
    access __x1__ = (AssignmentExpression "Evaluation")
    let spreadRef = __x1__
    app __x2__ = (GetValue spreadRef)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (GetIterator __x2__)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let iteratorRecord = __x3__
    while true {
      app __x4__ = (IteratorStep iteratorRecord)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let next = __x4__
      if (= next false) {
        app __x5__ = (WrapCompletion precedingArgs)
        return __x5__
      } else {}
      app __x6__ = (IteratorValue next)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let nextArg = __x6__
      append nextArg -> precedingArgs
    }
  }""")
}
