package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorReject extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncGeneratorReject" (generator, exception) => {
    let queue = generator["AsyncGeneratorQueue"]
    assert (< 0i queue["length"])
    let next = (pop queue 0i)
    let promiseCapability = next["Capability"]
    app __x0__ = (Call promiseCapability["Reject"] undefined (new [exception]))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (AsyncGeneratorResumeNext generator)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (WrapCompletion undefined)
    return __x2__
  }"""))
}
