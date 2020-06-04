package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformPromiseThen extends Algorithm {
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PerformPromiseThen" (promise, onFulfilled, onRejected, resultCapability) => {
    app __x0__ = (IsPromise promise)
    assert (= __x0__ true)
    if (! (= resultCapability absent)) {} else resultCapability = undefined
    app __x1__ = (IsCallable onFulfilled)
    if (= __x1__ false) onFulfilled = undefined else {}
    app __x2__ = (IsCallable onRejected)
    if (= __x2__ false) onRejected = undefined else {}
    let fulfillReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> "Fulfill", "Handler" -> onFulfilled))
    let rejectReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> "Reject", "Handler" -> onRejected))
    if (= promise["PromiseState"] "pending") {
      append fulfillReaction -> promise["PromiseFulfillReactions"]
      append rejectReaction -> promise["PromiseRejectReactions"]
    } else if (= promise["PromiseState"] "fulfilled") {
      let value = promise["PromiseResult"]
      app __x3__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [fulfillReaction, value]))
      __x3__
    } else {
      assert (= promise["PromiseState"] "rejected")
      let reason = promise["PromiseResult"]
      if (= promise["PromiseIsHandled"] false) {
        app __x4__ = (HostPromiseRejectionTracker promise "handle")
        __x4__
      } else {}
      app __x5__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [rejectReaction, reason]))
      __x5__
    }
    promise["PromiseIsHandled"] = true
    if (= resultCapability undefined) {
      app __x6__ = (WrapCompletion undefined)
      return __x6__
    } else {
      app __x7__ = (WrapCompletion resultCapability["Promise"])
      return __x7__
    }
  }"""))
}
