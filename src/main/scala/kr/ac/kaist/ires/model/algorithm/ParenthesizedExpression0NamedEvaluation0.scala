package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ParenthesizedExpression0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""ParenthesizedExpression0NamedEvaluation0" (this, Expression, name) => {
    app __x0__ = (IsAnonymousFunctionDefinition Expression)
    assert (= __x0__ true)
    access __x1__ = (Expression "NamedEvaluation")
    app __x2__ = (__x1__ name)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
