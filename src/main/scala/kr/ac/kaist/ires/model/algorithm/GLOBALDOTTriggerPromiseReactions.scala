package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTTriggerPromiseReactions extends Algorithm {
  val name: String = "GLOBALDOTTriggerPromiseReactions"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.TriggerPromiseReactions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reactions = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let argument = __x1__
    let __x2__ = reactions
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let reaction = __x2__[__x3__]
      app __x4__ = (NewPromiseReactionJob reaction argument)
      let job = __x4__
      app __x5__ = (HostEnqueuePromiseJob job["Job"] job["Realm"])
      __x5__
      __x3__ = (+ __x3__ 1i)
    }
    app __x6__ = (WrapCompletion undefined)
    return __x6__
  }"""), this)
}
