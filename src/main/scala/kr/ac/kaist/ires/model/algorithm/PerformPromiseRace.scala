package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformPromiseRace extends Algorithm {
  val name: String = "PerformPromiseRace"
  val length: Int = 3
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""PerformPromiseRace" (iteratorRecord, constructor, resultCapability) => {
    app __x0__ = (IsConstructor constructor)
    assert (= __x0__ true)
    while true {
      app __x1__ = (IteratorStep iteratorRecord)
      let next = __x1__
      app __x2__ = (IsAbruptCompletion next)
      if __x2__ iteratorRecord["Done"] = true else {}
      if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) {
        iteratorRecord["Done"] = true
        app __x3__ = (WrapCompletion resultCapability["Promise"])
        return __x3__
      } else {}
      app __x4__ = (IteratorValue next)
      let nextValue = __x4__
      app __x5__ = (IsAbruptCompletion nextValue)
      if __x5__ iteratorRecord["Done"] = true else {}
      if (is-completion nextValue) if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      app __x6__ = (Invoke constructor "resolve" (new [nextValue]))
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let nextPromise = __x6__
      app __x7__ = (Invoke nextPromise "then" (new [resultCapability["Resolve"], resultCapability["Reject"]]))
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      __x7__
    }
  }"""), this)
}
