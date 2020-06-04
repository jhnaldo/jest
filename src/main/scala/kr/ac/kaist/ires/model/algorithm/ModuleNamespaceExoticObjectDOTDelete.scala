package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTDelete extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""ModuleNamespaceExoticObject.Delete" (O, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (= __x1__ Symbol) {
      app __x2__ = (OrdinaryDelete O P)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    let exports = O["Exports"]
    if (contains exports P) {
      app __x4__ = (WrapCompletion false)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion true)
    return __x5__
  }""")
}
