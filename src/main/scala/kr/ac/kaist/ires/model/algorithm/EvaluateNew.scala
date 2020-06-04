package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EvaluateNew extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""EvaluateNew" (constructExpr, arguments) => {
    assert (|| (is-instance-of constructExpr NewExpression) (is-instance-of constructExpr MemberExpression))
    assert (|| (= arguments CONST_empty) (is-instance-of arguments Arguments))
    access __x0__ = (constructExpr "Evaluation")
    let ref = __x0__
    app __x1__ = (GetValue ref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let constructor = __x1__
    if (= arguments CONST_empty) let argList = (new []) else {
      access __x2__ = (arguments "ArgumentListEvaluation")
      let argList = __x2__
      if (is-completion argList) if (= argList["Type"] CONST_normal) argList = argList["Value"] else return argList else {}
      argList
    }
    app __x3__ = (IsConstructor constructor)
    if (= __x3__ false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (Construct constructor argList)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }""")
}
