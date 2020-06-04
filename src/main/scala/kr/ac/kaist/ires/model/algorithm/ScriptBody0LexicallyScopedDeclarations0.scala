package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptBody0LexicallyScopedDeclarations0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ScriptBody0LexicallyScopedDeclarations0" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelLexicallyScopedDeclarations")
    return __x0__
  }""")
}
