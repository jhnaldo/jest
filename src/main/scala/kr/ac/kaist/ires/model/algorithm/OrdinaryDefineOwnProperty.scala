package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryDefineOwnProperty extends Algorithm {
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = parseFunc(""""OrdinaryDefineOwnProperty" (O, P, Desc) => {
    app __x0__ = (O["GetOwnProperty"] O P)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let current = __x0__
    app __x1__ = (IsExtensible O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let extensible = __x1__
    app __x2__ = (ValidateAndApplyPropertyDescriptor O P extensible Desc current)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
