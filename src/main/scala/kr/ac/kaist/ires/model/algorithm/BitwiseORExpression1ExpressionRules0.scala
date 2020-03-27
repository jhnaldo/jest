package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BitwiseORExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseORExpression1ExpressionRules0""", List(Id("""this"""), Id("""BitwiseORExpression"""), Id("""BitwiseXORExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "BitwiseORExpression1ExpressionRules0" (this, BitwiseORExpression, BitwiseXORExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}