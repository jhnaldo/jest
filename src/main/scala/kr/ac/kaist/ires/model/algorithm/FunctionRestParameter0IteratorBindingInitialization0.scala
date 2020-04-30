package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionRestParameter0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = parseFunc(""""FunctionRestParameter0IteratorBindingInitialization0" (this, BindingRestElement, iteratorRecord, environment) => {
    access __x0__ = (BindingRestElement "ContainsExpression")
    if (= __x0__ false) {
      access __x1__ = (BindingRestElement "IteratorBindingInitialization")
      app __x2__ = (__x1__ iteratorRecord environment)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    let currentContext = GLOBAL_context
    access __x4__ = (currentContext "VariableEnvironment")
    let originalEnv = __x4__
    assert (= currentContext["VariableEnvironment"] currentContext["LexicalEnvironment"])
    assert (= environment originalEnv)
    app __x5__ = (NewDeclarativeEnvironment originalEnv)
    let paramVarEnv = __x5__
    currentContext["VariableEnvironment"] = paramVarEnv
    currentContext["LexicalEnvironment"] = paramVarEnv
    access __x6__ = (BindingRestElement "IteratorBindingInitialization")
    app __x7__ = (__x6__ iteratorRecord environment)
    let result = __x7__
    currentContext["VariableEnvironment"] = originalEnv
    currentContext["LexicalEnvironment"] = originalEnv
    app __x8__ = (WrapCompletion result)
    return __x8__
  }""")
}
