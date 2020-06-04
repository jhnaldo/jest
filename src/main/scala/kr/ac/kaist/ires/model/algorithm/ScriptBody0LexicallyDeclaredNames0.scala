package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptBody0LexicallyDeclaredNames0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ScriptBody0LexicallyDeclaredNames0" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelLexicallyDeclaredNames")
    return __x0__
  }""")
}
