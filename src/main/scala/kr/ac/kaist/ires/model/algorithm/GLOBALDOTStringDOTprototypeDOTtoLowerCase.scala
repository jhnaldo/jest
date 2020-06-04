package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTtoLowerCase extends Algorithm {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.String.prototype.toLowerCase" (this, argumentsList, NewTarget) => {
    app __x0__ = (RequireObjectCoercible this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (ToString O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    !!! "Etc"
    !!! "Etc"
    let L = !!! "StringOp"
    app __x2__ = (WrapCompletion L)
    return __x2__
  }""")
}
