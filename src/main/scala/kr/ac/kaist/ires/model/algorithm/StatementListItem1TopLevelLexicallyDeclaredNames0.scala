package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1TopLevelLexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = parseFunc(""""StatementListItem1TopLevelLexicallyDeclaredNames0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      return (new [])
    } else {}
    access __x0__ = (Declaration "BoundNames")
    return __x0__
  }""")
}
