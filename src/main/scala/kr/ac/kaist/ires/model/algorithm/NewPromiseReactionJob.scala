package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewPromiseReactionJob {
  val length: Int = 2
  val func: Func = parseFunc(""""NewPromiseReactionJob" (reaction, argument) => {
    !!! "Let id:{job} be a new Job abstract closure with no parameters that captures id:{reaction} and id:{argument} and performs the following steps when called : step-list:{...}"
    let handlerRealm = null
    if (! (= reaction["Handler"] undefined)) {
      app __x0__ = (GetFunctionRealm reaction["Handler"])
      let getHandlerRealmResult = __x0__
      if (&& (is-completion getHandlerRealmResult) (= getHandlerRealmResult["Type"] CONST_normal)) handlerRealm = getHandlerRealmResult["Value"] else {}
    } else {}
    app __x1__ = (WrapCompletion (new Record("Job" -> job, "Realm" -> handlerRealm)))
    return __x1__
  }""")
}
