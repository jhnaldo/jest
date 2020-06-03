package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object INTRINSIC_AsyncFromSyncIteratorPrototypeDOTthrow {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""INTRINSIC_AsyncFromSyncIteratorPrototype.throw" (value) => {
    let O = this
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    app __x1__ = (Type O)
    if (|| (! (= __x1__ Object)) (= O["SyncIteratorRecord"] absent)) {
      let invalidIteratorError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x2__ = (Call promiseCapability["Reject"] undefined (new [invalidIteratorError]))
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (WrapCompletion promiseCapability["Promise"])
      return __x3__
    } else {}
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x4__ = (GetMethod syncIterator "throw")
    let throw = __x4__
    if (is-completion throw) if (= throw["Type"] CONST_normal) throw = throw["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [throw["Value"]]))
      if (&& (is-completion __x5__) (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    throw
    if (= throw undefined) {
      app __x6__ = (Call promiseCapability["Reject"] undefined (new [value]))
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      __x6__
      app __x7__ = (WrapCompletion promiseCapability["Promise"])
      return __x7__
    } else {}
    app __x8__ = (Call throw syncIterator (new [value]))
    let result = __x8__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x9__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x9__) (! (= __x9__["Type"] CONST_normal))) return __x9__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x10__ = (Type result)
    if (! (= __x10__ Object)) {
      app __x11__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      app __x12__ = (WrapCompletion promiseCapability["Promise"])
      return __x12__
    } else {}
    app __x13__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    app __x14__ = (WrapCompletion __x13__)
    return __x14__
  }""")
}
