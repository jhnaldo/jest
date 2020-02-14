package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LogicalANDExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""LogicalANDExpression1ExpressionRules0""", List(Id("""this"""), Id("""LogicalANDExpression"""), Id("""BitwiseORExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BitwiseORExpression"""))), EStr("""HasCallInTailPosition""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "LogicalANDExpression1ExpressionRules0" (this, LogicalANDExpression, BitwiseORExpression) => {
    access __x0__ = (BitwiseORExpression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
