package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTtoString extends Algorithm {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.toString" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let array = __x0__
    app __x1__ = (Get array "join")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let func = __x1__
    !!! "Etc"
    app __x2__ = (Call func array)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
