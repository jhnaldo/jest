package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncMethod0ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = parseFunc(""""AsyncMethod0ComputedPropertyContains0" (this, PropertyName, UniqueFormalParameters, AsyncFunctionBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }""")
}
