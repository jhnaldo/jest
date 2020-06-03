package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1HasCallInTailPosition0 {
  val length: Int = 0
  val func: Func = parseFunc(""""StatementList1HasCallInTailPosition0" (this, StatementList, StatementListItem, call) => {
    access __x0__ = (StatementList "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    let has = __x1__
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (StatementListItem "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }""")
}