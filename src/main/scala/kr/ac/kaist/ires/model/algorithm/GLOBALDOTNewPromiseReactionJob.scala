package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNewPromiseReactionJob extends Algorithm {
  val name: String = "GLOBALDOTNewPromiseReactionJob"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.NewPromiseReactionJob" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reaction = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let argument = __x1__
    !!! "Let id:{job} be a new Job abstract closure with no parameters that captures id:{reaction} and id:{argument} and performs the following steps when called : step-list:{...}"
    let handlerRealm = null
    if (! (= reaction["Handler"] undefined)) {
      app __x2__ = (GetFunctionRealm reaction["Handler"])
      let getHandlerRealmResult = __x2__
      if (&& (is-completion getHandlerRealmResult) (= getHandlerRealmResult["Type"] CONST_normal)) handlerRealm = getHandlerRealmResult["Value"] else {}
    } else {}
    app __x3__ = (WrapCompletion (new Record("Job" -> job, "Realm" -> handlerRealm)))
    return __x3__
  }"""), this)
}
