package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAddEntriesFromIterable extends Algorithm {
  val length: Int = 3
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.AddEntriesFromIterable" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let iterable = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let adder = __x2__
    app __x3__ = (IsCallable adder)
    if (= __x3__ false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (GetIterator iterable)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let iteratorRecord = __x5__
    while true {
      app __x6__ = (IteratorStep iteratorRecord)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let next = __x6__
      if (= next false) {
        app __x7__ = (WrapCompletion target)
        return __x7__
      } else {}
      app __x8__ = (IteratorValue next)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let nextItem = __x8__
      app __x9__ = (Type nextItem)
      if (! (= __x9__ Object)) {
        app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        let error = __x10__
        app __x11__ = (IteratorClose iteratorRecord error)
        if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        app __x12__ = (WrapCompletion __x11__)
        return __x12__
      } else {}
      app __x13__ = (Get nextItem "0")
      let k = __x13__
      app __x14__ = (IsAbruptCompletion k)
      if __x14__ {
        app __x15__ = (IteratorClose iteratorRecord k)
        if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        app __x16__ = (WrapCompletion __x15__)
        return __x16__
      } else {}
      app __x17__ = (Get nextItem "1")
      let v = __x17__
      app __x18__ = (IsAbruptCompletion v)
      if __x18__ {
        app __x19__ = (IteratorClose iteratorRecord v)
        if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        app __x20__ = (WrapCompletion __x19__)
        return __x20__
      } else {}
      app __x21__ = (Call adder target (new [k["Value"], v["Value"]]))
      let status = __x21__
      app __x22__ = (IsAbruptCompletion status)
      if __x22__ {
        app __x23__ = (IteratorClose iteratorRecord status)
        if (is-completion __x23__) if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
        app __x24__ = (WrapCompletion __x23__)
        return __x24__
      } else {}
    }
  }""")
}
