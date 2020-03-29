package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingRestElement1IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = parseFunc(""""BindingRestElement1IteratorBindingInitialization0" (this, BindingPattern, iteratorRecord, environment) => {
    app __x0__ = (ArrayCreate 0i)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let A = __x0__
    let n = 0i
    while true {
      if (= iteratorRecord["Done"] false) {
        app __x1__ = (IteratorStep iteratorRecord)
        let next = __x1__
        app __x2__ = (IsAbruptCompletion next)
        if __x2__ iteratorRecord["Done"] = true else {}
        if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
        next
        if (= next false) iteratorRecord["Done"] = true else {}
      } else {}
      if (= iteratorRecord["Done"] true) {
        access __x3__ = (BindingPattern "BindingInitialization")
        app __x4__ = (__x3__ A environment)
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
      app __x6__ = (IteratorValue next)
      let nextValue = __x6__
      app __x7__ = (IsAbruptCompletion nextValue)
      if __x7__ iteratorRecord["Done"] = true else {}
      if (is-completion nextValue) if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      app __x8__ = (ToString n)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (CreateDataProperty A __x8__ nextValue)
      let status = __x9__
      assert (= status true)
      n = (+ n 1i)
    }
  }""")
}
