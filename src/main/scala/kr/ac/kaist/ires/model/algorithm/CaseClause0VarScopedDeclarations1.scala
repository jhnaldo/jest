package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0VarScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0VarScopedDeclarations1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarScopedDeclarations""")), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IReturn(EList(List())))))
  /* Beautified form:
  "CaseClause0VarScopedDeclarations1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
