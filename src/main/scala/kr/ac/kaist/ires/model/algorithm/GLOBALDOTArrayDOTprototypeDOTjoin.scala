package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTjoin {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.join" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let separator = __x0__
    app __x1__ = (ToObject this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (LengthOfArrayLike O)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let len = __x2__
    if (= separator undefined) let sep = "," else {
      app __x3__ = (ToString separator)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let sep = __x3__
    }
    let R = ""
    let k = 0i
    while (< k len) {
      if (< 0i k) R = (+ R sep) else {}
      app __x4__ = (ToString k)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (Get O __x4__)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let element = __x5__
      if (|| (= element undefined) (= element null)) let next = "" else {
        app __x6__ = (ToString element)
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        let next = __x6__
      }
      R = (+ R next)
      k = (+ k 1i)
    }
    app __x7__ = (WrapCompletion R)
    return __x7__
  }""")
}
