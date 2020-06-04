package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateMethodProperty extends Algorithm {
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = parseFunc(""""CreateMethodProperty" (O, P, V) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    app __x1__ = (IsPropertyKey P)
    assert (= __x1__ true)
    let newDesc = (new PropertyDescriptor("Value" -> V, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true))
    app __x2__ = (O["DefineOwnProperty"] O P newDesc)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
