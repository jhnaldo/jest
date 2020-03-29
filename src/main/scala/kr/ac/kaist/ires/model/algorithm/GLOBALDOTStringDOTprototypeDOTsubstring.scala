package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTsubstring {
  val length: Int = 2
  val func: Func = parseFunc(""""GLOBAL.String.prototype.substring" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let start = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let end = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    let len = S["length"]
    app __x4__ = (ToInteger start)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let intStart = __x4__
    if (= end undefined) let intEnd = len else {
      app __x5__ = (ToInteger end)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let intEnd = __x5__
    }
    app __x6__ = (max intStart 0i)
    app __x7__ = (min __x6__ len)
    let finalStart = __x7__
    app __x8__ = (max intEnd 0i)
    app __x9__ = (min __x8__ len)
    let finalEnd = __x9__
    app __x10__ = (min finalStart finalEnd)
    let from = __x10__
    app __x11__ = (max finalStart finalEnd)
    let to = __x11__
    app __x12__ = (WrapCompletion !!! "StringOp")
    return __x12__
  }""")
}
