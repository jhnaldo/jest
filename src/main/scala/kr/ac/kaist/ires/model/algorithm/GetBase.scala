package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetBase {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""GetBase" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    app __x1__ = (WrapCompletion V["BaseValue"])
    return __x1__
  }""")
}
