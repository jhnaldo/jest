package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList0ExpectedArgumentCount0 {
  val func: Func = parseFunc(""""FormalParameterList0ExpectedArgumentCount0" (this, FormalParameter) => {
    access __x0__ = (FormalParameter "HasInitializer")
    if (= __x0__ true) return 0
    else {}
    return 1
  }""")
}
