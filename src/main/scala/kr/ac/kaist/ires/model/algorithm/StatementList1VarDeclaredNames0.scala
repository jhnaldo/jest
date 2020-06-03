package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1VarDeclaredNames0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""StatementList1VarDeclaredNames0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "VarDeclaredNames")
    let names = __x0__
    access __x1__ = (StatementListItem "VarDeclaredNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    return names
  }""")
}
