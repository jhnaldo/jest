package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RelationalExpression6Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""RelationalExpression6Evaluation0" (this, RelationalExpression, ShiftExpression) => {
    access __x0__ = (RelationalExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (ShiftExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (Type rval)
    if (! (= __x4__ Object)) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    app __x6__ = (ToPropertyKey lval)
    app __x7__ = (HasProperty rval __x6__)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }""")
}
