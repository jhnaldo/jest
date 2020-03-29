package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Block0Evaluation1 {
  val length: Int = 0
  val func: Func = parseFunc(""""Block0Evaluation1" (this, StatementList) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment oldEnv)
    let blockEnv = __x0__
    app __x1__ = (BlockDeclarationInstantiation StatementList blockEnv)
    __x1__
    GLOBAL_context["LexicalEnvironment"] = blockEnv
    access __x2__ = (StatementList "Evaluation")
    let blockValue = __x2__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x3__ = (WrapCompletion blockValue)
    return __x3__
  }""")
}
