package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTgetMapDOTprototypeDOTsize {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.getMap.prototype.size" (this, argumentsList, NewTarget) => {
    let M = this
    app __x0__ = (RequireInternalSlot M "MapData")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    let entries = M["MapData"]
    let count = 0i
    let __x1__ = entries
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let p = __x1__[__x2__]
      if (! (= p["Key"] CONST_empty)) count = (+ count 1i) else {}
      __x2__ = (+ __x2__ 1i)
    }
    app __x3__ = (WrapCompletion count)
    return __x3__
  }""")
}
