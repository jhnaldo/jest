package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryObjectDOTGetOwnProperty {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""OrdinaryObject.GetOwnProperty" (O, P) => {
    app __x0__ = (OrdinaryGetOwnProperty O P)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
