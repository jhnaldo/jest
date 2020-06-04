package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTCreateAsyncFromSyncIterator extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.CreateAsyncFromSyncIterator" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let syncIteratorRecord = __x0__
    app __x1__ = (ObjectCreate INTRINSIC_AsyncFromSyncIteratorPrototype (new ["SyncIteratorRecord"]))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let asyncIterator = __x1__
    asyncIterator["SyncIteratorRecord"] = syncIteratorRecord
    app __x2__ = (GetIterator asyncIterator CONST_async)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
