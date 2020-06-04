package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameters4IteratorBindingInitialization0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""FormalParameters4IteratorBindingInitialization0" (this, FormalParameterList, FunctionRestParameter, iteratorRecord, environment) => {
    access __x0__ = (FormalParameterList "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (FunctionRestParameter "IteratorBindingInitialization")
    app __x3__ = (__x2__ iteratorRecord environment)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }""")
}
