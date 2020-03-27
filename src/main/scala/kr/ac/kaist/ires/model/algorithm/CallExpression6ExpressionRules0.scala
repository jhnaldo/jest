package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression6ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression6ExpressionRules0""", List(Id("""this"""), Id("""CallExpression"""), Id("""TemplateLiteral""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), ERef(RefId(Id("""call""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "CallExpression6ExpressionRules0" (this, CallExpression, TemplateLiteral) => {
    if (= this call) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}