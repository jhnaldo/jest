package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncGeneratorReject {
  val length: Int = 2
  val func: Func = parseFunc(""""GLOBAL.AsyncGeneratorReject" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let exception = __x1__
    let queue = generator["AsyncGeneratorQueue"]
    assert (< 0i queue["length"])
    let next = (pop queue 0i)
    let promiseCapability = next["Capability"]
    app __x2__ = (Call promiseCapability["Reject"] undefined (new [exception]))
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (AsyncGeneratorResumeNext generator)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }""")
}
