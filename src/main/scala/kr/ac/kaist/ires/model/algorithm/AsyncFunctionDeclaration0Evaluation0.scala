package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionDeclaration0Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""AsyncFunctionDeclaration0Evaluation0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
