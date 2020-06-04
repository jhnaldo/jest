package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayLiteral2Evaluation1 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ArrayLiteral2Evaluation1" (this, ElementList, Elision) => {
    app __x0__ = (ArrayCreate 0i)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let array = __x0__
    access __x1__ = (ElementList "ArrayAccumulation")
    app __x2__ = (__x1__ array 0i)
    let len = __x2__
    if (is-completion len) if (= len["Type"] CONST_normal) len = len["Value"] else return len else {}
    len
    if (= Elision absent) let padding = 0i else {
      access __x3__ = (Elision "ElisionWidth")
      let padding = __x3__
    }
    app __x4__ = (ToUint32 (+ padding len))
    app __x5__ = (Set array "length" __x4__ false)
    __x5__
    app __x6__ = (WrapCompletion array)
    return __x6__
  }""")
}
