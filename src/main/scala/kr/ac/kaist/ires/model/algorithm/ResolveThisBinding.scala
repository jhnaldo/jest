package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ResolveThisBinding {
  val length: Int = 0
  val func: Func = parseFunc(""""ResolveThisBinding" () => {
    app __x0__ = (GetThisEnvironment )
    let envRec = __x0__
    app __x1__ = (envRec["GetThisBinding"] envRec)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
