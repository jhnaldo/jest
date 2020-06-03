package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTgetSetDOTprototypeDOTsize {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.getSet.prototype.size" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (Type S)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (= S["SetData"] absent) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let entries = S["SetData"]
    let count = 0i
    let __x3__ = entries
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let e = __x3__[__x4__]
      if (! (= e CONST_empty)) count = (+ count 1i) else {}
      __x4__ = (+ __x4__ 1i)
    }
    app __x5__ = (WrapCompletion count)
    return __x5__
  }""")
}
