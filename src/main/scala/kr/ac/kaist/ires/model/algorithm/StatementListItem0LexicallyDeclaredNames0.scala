package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem0LexicallyDeclaredNames0""", List(Id("""this"""), Id("""Statement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """Statement10"""), ISeq(List(IAccess(Id("""LabelledStatement"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledStatement""")), IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledStatement"""))), EStr("""LexicallyDeclaredNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IReturn(EList(List())))))
  /* Beautified form:
  "StatementListItem0LexicallyDeclaredNames0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (LabelledStatement "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
