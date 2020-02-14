package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression5Contains0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression5Contains0""", List(Id("""this"""), Id("""CallExpression"""), Id("""IdentifierName"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CallExpression"""))), EStr("""Contains""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)), ISeq(List())), IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ReservedWord"""), IReturn(EBool(false)), ISeq(List())), IIf(EBOp(OAnd, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """Identifier"""), EBOp(OEq, EGetSyntax(ERef(RefId(Id("""symbol""")))), EGetSyntax(ERef(RefId(Id("""IdentifierName""")))))), IReturn(EBool(true)), ISeq(List())), IReturn(EBool(false)))))
  /* Beautified form:
  "CallExpression5Contains0" (this, CallExpression, IdentifierName, symbol) => {
    access __x0__ = (CallExpression "Contains")
    app __x1__ = (__x0__ symbol)
    if (= __x1__ true) return true else {}
    if (is-instance-of symbol ReservedWord) return false else {}
    if (&& (is-instance-of symbol Identifier) (= (get-syntax symbol) (get-syntax IdentifierName))) return true else {}
    return false
  }
  */
}
