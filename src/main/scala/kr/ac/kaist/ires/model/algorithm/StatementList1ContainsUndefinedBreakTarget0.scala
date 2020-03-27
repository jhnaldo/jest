package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsUndefinedBreakTarget""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)), ISeq(List())), IAccess(Id("""__x2__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""ContainsUndefinedBreakTarget""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "StatementList1ContainsUndefinedBreakTarget0" (this, StatementList, StatementListItem, labelSet) => {
    access __x0__ = (StatementList "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (StatementListItem "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}