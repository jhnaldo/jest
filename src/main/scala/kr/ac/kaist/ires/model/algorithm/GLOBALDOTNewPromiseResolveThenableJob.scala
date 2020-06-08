package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNewPromiseResolveThenableJob extends Algorithm {
  val name: String = "GLOBALDOTNewPromiseResolveThenableJob"
  val length: Int = 3
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.NewPromiseResolveThenableJob" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promiseToResolve = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thenable = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let then = __x2__
    !!! "Let id:{job} be a new Job abstract closure with no parameters that captures id:{promiseToResolve} , id:{thenable} , and id:{then} and performs the following steps when called : step-list:{...}"
    app __x3__ = (GetFunctionRealm then)
    let getThenRealmResult = __x3__
    if (&& (is-completion getThenRealmResult) (= getThenRealmResult["Type"] CONST_normal)) let thenRealm = getThenRealmResult["Value"] else let thenRealm = null
    app __x4__ = (WrapCompletion (new Record("Job" -> job, "Realm" -> thenRealm)))
    return __x4__
  }"""), this)
}
