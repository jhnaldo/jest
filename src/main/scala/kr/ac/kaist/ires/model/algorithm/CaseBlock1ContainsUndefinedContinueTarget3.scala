package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock1ContainsUndefinedContinueTarget3 {
  val length: Int = 0
  val func: Func = parseFunc(""""CaseBlock1ContainsUndefinedContinueTarget3" (this, CaseClauses0, DefaultClause, CaseClauses1, iterationSet, labelSet) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "ContainsUndefinedContinueTarget")
      app __x1__ = (__x0__ iterationSet (new []))
      let hasUndefinedLabels = __x1__
      if (= hasUndefinedLabels true) return true else {}
    } else {}
    access __x2__ = (DefaultClause "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    let hasUndefinedLabels = __x3__
    if (= hasUndefinedLabels true) return true else {}
    if (= CaseClauses1 absent) return false else {}
    access __x4__ = (CaseClauses1 "ContainsUndefinedContinueTarget")
    app __x5__ = (__x4__ iterationSet (new []))
    return __x5__
  }""")
}
