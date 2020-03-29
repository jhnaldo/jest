package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ElementList1ArrayAccumulation1 {
  val length: Int = 0
  val func: Func = parseFunc(""""ElementList1ArrayAccumulation1" (this, Elision, SpreadElement, array, nextIndex) => {
    if (= Elision absent) let padding = 0i else {
      access __x0__ = (Elision "ElisionWidth")
      let padding = __x0__
    }
    access __x1__ = (SpreadElement "ArrayAccumulation")
    app __x2__ = (__x1__ array (+ nextIndex padding))
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
