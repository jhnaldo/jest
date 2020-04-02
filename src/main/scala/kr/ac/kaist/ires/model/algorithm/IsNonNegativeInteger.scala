package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsNonNegativeInteger {
  val length: Int = 1
  val func: Func = parseFunc(""""IsNonNegativeInteger" (argument) => {
    app __x0__ = (IsInteger argument)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    if (&& (= __x0__ true) (! (< argument 0i))) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion false)
      return __x2__
    }
  }""")
}
