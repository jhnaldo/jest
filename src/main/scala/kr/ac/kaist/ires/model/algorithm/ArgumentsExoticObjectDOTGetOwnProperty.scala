package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgumentsExoticObjectDOTGetOwnProperty {
  val length: Int = 1
  val func: Func = parseFunc(""""ArgumentsExoticObject.GetOwnProperty" (args, P) => {
    let args = args
    app __x0__ = (OrdinaryGetOwnProperty args P)
    let desc = __x0__
    if (= desc undefined) {
      app __x1__ = (WrapCompletion desc)
      return __x1__
    } else {}
    let map = args["ParameterMap"]
    app __x2__ = (HasOwnProperty map P)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let isMapped = __x2__
    if (= isMapped true) {
      app __x3__ = (Get map P)
      desc["Value"] = __x3__
    } else {}
    app __x4__ = (WrapCompletion desc)
    return __x4__
  }""")
}
