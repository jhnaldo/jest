package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncFromSyncIteratorContinuation {
  val length: Int = 2
  val func: Func = parseFunc(""""GLOBAL.AsyncFromSyncIteratorContinuation" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let result = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let promiseCapability = __x1__
    app __x2__ = (IteratorComplete result)
    let done = __x2__
    if (is-completion done) if (= done["Type"] CONST_normal) done = done["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [done["Value"]]))
      if (&& (is-completion __x3__) (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    done
    app __x4__ = (IteratorValue result)
    let value = __x4__
    if (is-completion value) if (= value["Type"] CONST_normal) value = value["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [value["Value"]]))
      if (&& (is-completion __x5__) (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    value
    app __x6__ = (PromiseResolve INTRINSIC_Promise value)
    let valueWrapper = __x6__
    if (is-completion valueWrapper) if (= valueWrapper["Type"] CONST_normal) valueWrapper = valueWrapper["Value"] else {
      app __x7__ = (Call promiseCapability["Reject"] undefined (new [valueWrapper["Value"]]))
      if (&& (is-completion __x7__) (! (= __x7__["Type"] CONST_normal))) return __x7__ else {}
      return promiseCapability["Promise"]
    } else {}
    valueWrapper
    let steps = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAsyncfromSyncIteratorValueUnwrapFunctions))
    app __x8__ = (CreateBuiltinFunction steps (new ["Done"]))
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let onFulfilled = __x8__
    onFulfilled["Done"] = done
    app __x9__ = (PerformPromiseThen valueWrapper onFulfilled undefined promiseCapability)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    __x9__
    app __x10__ = (WrapCompletion promiseCapability["Promise"])
    return __x10__
  }""")
}
