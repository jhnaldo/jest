package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorResumeNext {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""AsyncGeneratorResumeNext" (generator) => {
    let state = generator["AsyncGeneratorState"]
    assert (! (= state "executing"))
    if (= state "awaiting-return") {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    let queue = generator["AsyncGeneratorQueue"]
    if (= queue["length"] 0i) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    let next = queue[0i]
    let completion = next["Completion"]
    app __x2__ = (IsAbruptCompletion completion)
    if __x2__ {
      if (= state "suspendedStart") {
        generator["AsyncGeneratorState"] = "completed"
        state = "completed"
      } else {}
      if (= state "completed") if (= completion["Type"] CONST_return) {
        generator["AsyncGeneratorState"] = "awaiting-return"
        app __x3__ = (PromiseResolve INTRINSIC_Promise completion["Value"])
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        let promise = __x3__
        let stepsFulfilled = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAsyncGeneratorResumeNextReturnProcessorFulfilledFunctions))
        app __x4__ = (CreateBuiltinFunction stepsFulfilled (new ["Generator"]))
        let onFulfilled = __x4__
        onFulfilled["Generator"] = generator
        let stepsRejected = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAsyncGeneratorResumeNextReturnProcessorRejectedFunctions))
        app __x5__ = (CreateBuiltinFunction stepsRejected (new ["Generator"]))
        let onRejected = __x5__
        onRejected["Generator"] = generator
        app __x6__ = (PerformPromiseThen promise onFulfilled onRejected)
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        __x6__
        app __x7__ = (WrapCompletion undefined)
        return __x7__
      } else {
        assert (= completion["Type"] CONST_throw)
        app __x8__ = (AsyncGeneratorReject generator completion["Value"])
        if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        __x8__
        app __x9__ = (WrapCompletion undefined)
        return __x9__
      } else {}
    } else if (= state "completed") {
      app __x10__ = (AsyncGeneratorResolve generator undefined true)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    assert (|| (= state "suspendedStart") (= state "suspendedYield"))
    let genContext = generator["AsyncGeneratorContext"]
    let callerContext = GLOBAL_context
    generator["AsyncGeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x12__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x12__ -> genContext["ReturnCont"]
      app __x13__ = (genContext["ResumeCont"] completion)
    }
    app __x14__ = (WrapCompletion undefined)
    return __x14__
  }""")
}
