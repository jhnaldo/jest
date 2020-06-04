package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinarySet extends Algorithm {
  val length: Int = 4
  val lang: Boolean = true
  val func: Func = parseFunc(""""OrdinarySet" (O, P, V, Receiver) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (O["GetOwnProperty"] O P)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let ownDesc = __x1__
    app __x2__ = (OrdinarySetWithOwnDescriptor O P V Receiver ownDesc)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
