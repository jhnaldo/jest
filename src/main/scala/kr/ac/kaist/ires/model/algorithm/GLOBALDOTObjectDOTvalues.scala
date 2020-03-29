package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTvalues {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.Object.values" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (ToObject O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let obj = __x1__
    app __x2__ = (EnumerableOwnPropertyNames obj "value")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let nameList = __x2__
    app __x3__ = (CreateArrayFromList nameList)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }""")
}
