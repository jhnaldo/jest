package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrepareForTailCall {
  val length: Int = 0
  val func: Func = parseFunc(""""PrepareForTailCall" () => {
    let leafContext = GLOBAL_context
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] leafContext) {
      __x0__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x0__)
      if (= GLOBAL_executionStack["length"] 0i) GLOBAL_context = null else GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    } else GLOBAL_context = null
  }""")
}
