package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetActiveScriptOrModule extends Algorithm {
  val name: String = "GetActiveScriptOrModule"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetActiveScriptOrModule" () => {
    if (= GLOBAL_executionStack["length"] 0i) {
      app __x0__ = (WrapCompletion null)
      return __x0__
    } else {}
    !!! "Let id:{ec} be the topmost execution context on the execution context stack whose ScriptOrModule component is not value:{null} ."
    !!! "If no such execution context exists , return value:{null} . Otherwise , return id:{ec} ' s ScriptOrModule ."
  }"""), this)
}
