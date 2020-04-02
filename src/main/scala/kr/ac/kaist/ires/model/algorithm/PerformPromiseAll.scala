package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformPromiseAll {
  val length: Int = 3
  val func: Func = parseFunc(""""PerformPromiseAll" (iteratorRecord, constructor, resultCapability) => {
    app __x0__ = (IsConstructor constructor)
    assert (= __x0__ true)
    let values = (new [])
    let remainingElementsCount = (new Record("Value" -> 1i))
    let index = 0i
    while true {
      app __x1__ = (IteratorStep iteratorRecord)
      let next = __x1__
      app __x2__ = (IsAbruptCompletion next)
      if __x2__ iteratorRecord["Done"] = true else {}
      if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) {
        iteratorRecord["Done"] = true
        remainingElementsCount["Value"] = (- remainingElementsCount["Value"] 1i)
        if (= remainingElementsCount["Value"] 0i) {
          app __x3__ = (CreateArrayFromList values)
          let valuesArray = __x3__
          app __x4__ = (Call resultCapability["Resolve"] undefined (new [valuesArray]))
          if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
          __x4__
        } else {}
        app __x5__ = (WrapCompletion resultCapability["Promise"])
        return __x5__
      } else {}
      app __x6__ = (IteratorValue next)
      let nextValue = __x6__
      app __x7__ = (IsAbruptCompletion nextValue)
      if __x7__ iteratorRecord["Done"] = true else {}
      if (is-completion nextValue) if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      append undefined -> values
      app __x8__ = (Invoke constructor "resolve" (new [nextValue]))
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let nextPromise = __x8__
      let steps = !!! "Algorithms"
      app __x9__ = (CreateBuiltinFunction steps (new ["AlreadyCalled", "Index", "Values", "Capability", "RemainingElements"]))
      let resolveElement = __x9__
      resolveElement["AlreadyCalled"] = (new Record("Value" -> false))
      resolveElement["Index"] = index
      resolveElement["Values"] = values
      resolveElement["Capability"] = resultCapability
      resolveElement["RemainingElements"] = remainingElementsCount
      remainingElementsCount["Value"] = (+ remainingElementsCount["Value"] 1i)
      app __x10__ = (Invoke nextPromise "then" (new [resolveElement, resultCapability["Reject"]]))
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      __x10__
      index = (+ index 1i)
    }
  }""")
}
