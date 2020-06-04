package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTgetMapDOTprototypeDOTsize extends Algorithm {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.getMap.prototype.size" (this, argumentsList, NewTarget) => {
    let M = this
    app __x0__ = (Type M)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (= M["MapData"] absent) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let entries = M["MapData"]
    let count = 0i
    let __x3__ = entries
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let p = __x3__[__x4__]
      if (! (= p["Key"] CONST_empty)) count = (+ count 1i) else {}
      __x4__ = (+ __x4__ 1i)
    }
    app __x5__ = (WrapCompletion count)
    return __x5__
  }""")
}
