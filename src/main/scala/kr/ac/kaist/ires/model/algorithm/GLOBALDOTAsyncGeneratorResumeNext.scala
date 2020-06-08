package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncGeneratorResumeNext extends Algorithm {
  val name: String = "GLOBALDOTAsyncGeneratorResumeNext"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.AsyncGeneratorResumeNext" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    let state = generator["AsyncGeneratorState"]
    assert (! (= state CONST_executing))
    if (= state CONST_awaitingreturn) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    let queue = generator["AsyncGeneratorQueue"]
    if (= queue["length"] 0i) {
      app __x2__ = (WrapCompletion undefined)
      return __x2__
    } else {}
    let next = queue[0i]
    let completion = next["Completion"]
    app __x3__ = (IsAbruptCompletion completion)
    if __x3__ {
      if (= state CONST_suspendedStart) {
        generator["AsyncGeneratorState"] = CONST_completed
        state = CONST_completed
      } else {}
      if (= state CONST_completed) if (= completion["Type"] CONST_return) {
        generator["AsyncGeneratorState"] = CONST_awaitingreturn
        app __x4__ = (PromiseResolve INTRINSIC_Promise completion["Value"])
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let promise = __x4__
        let stepsFulfilled = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAsyncGeneratorResumeNextReturnProcessorFulfilledFunctions))
        app __x5__ = (CreateBuiltinFunction stepsFulfilled (new ["Generator"]))
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        let onFulfilled = __x5__
        onFulfilled["Generator"] = generator
        let stepsRejected = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAsyncGeneratorResumeNextReturnProcessorRejectedFunctions))
        app __x6__ = (CreateBuiltinFunction stepsRejected (new ["Generator"]))
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        let onRejected = __x6__
        onRejected["Generator"] = generator
        app __x7__ = (PerformPromiseThen promise onFulfilled onRejected)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        __x7__
        app __x8__ = (WrapCompletion undefined)
        return __x8__
      } else {
        assert (= completion["Type"] CONST_throw)
        app __x9__ = (AsyncGeneratorReject generator completion["Value"])
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        __x9__
        app __x10__ = (WrapCompletion undefined)
        return __x10__
      } else {}
    } else if (= state CONST_completed) {
      app __x11__ = (AsyncGeneratorResolve generator undefined true)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (WrapCompletion __x11__)
      return __x12__
    } else {}
    assert (|| (= state CONST_suspendedStart) (= state CONST_suspendedYield))
    let genContext = generator["AsyncGeneratorContext"]
    let callerContext = GLOBAL_context
    generator["AsyncGeneratorState"] = CONST_executing
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x13__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x13__ -> genContext["ReturnCont"]
      app __x14__ = (genContext["ResumeCont"] completion)
    }
    app __x15__ = (WrapCompletion undefined)
    return __x15__
  }"""), this)
}
