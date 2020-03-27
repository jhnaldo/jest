package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock1ContainsUndefinedBreakTarget3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1ContainsUndefinedBreakTarget3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""ContainsUndefinedBreakTarget""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)), ISeq(List())))), ISeq(List())), IAccess(Id("""__x2__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""ContainsUndefinedBreakTarget""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent), IReturn(EBool(false)), ISeq(List())), IAccess(Id("""__x4__"""), ERef(RefId(Id("""CaseClauses1"""))), EStr("""ContainsUndefinedBreakTarget""")), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""labelSet"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "CaseBlock1ContainsUndefinedBreakTarget3" (this, CaseClauses0, DefaultClause, CaseClauses1, labelSet) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "ContainsUndefinedBreakTarget")
      app __x1__ = (__x0__ labelSet)
      let hasUndefinedLabels = __x1__
      if (= hasUndefinedLabels true) return true else {}
    } else {}
    access __x2__ = (DefaultClause "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    let hasUndefinedLabels = __x3__
    if (= hasUndefinedLabels true) return true else {}
    if (= CaseClauses1 absent) return false else {}
    access __x4__ = (CaseClauses1 "ContainsUndefinedBreakTarget")
    app __x5__ = (__x4__ labelSet)
    return __x5__
  }
  */
}