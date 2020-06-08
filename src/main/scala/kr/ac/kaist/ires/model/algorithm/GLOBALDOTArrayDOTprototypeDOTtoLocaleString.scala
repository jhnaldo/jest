package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTtoLocaleString extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTtoLocaleString"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.toLocaleString" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reserved1 = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let reserved2 = __x1__
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let array = __x2__
    app __x3__ = (LengthOfArrayLike array)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    !!! "Etc"
    let R = ""
    let k = 0i
    while (< k len) {
      if (< 0i k) R = (+ R separator) else {}
      app __x4__ = (ToString k)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (Get array __x4__)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let nextElement = __x5__
      if (! (|| (= nextElement undefined) (= nextElement null))) {
        app __x6__ = (Invoke nextElement "toLocaleString")
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        app __x7__ = (ToString __x6__)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let S = __x7__
        R = (+ R S)
      } else {}
      k = (+ k 1i)
    }
    app __x8__ = (WrapCompletion R)
    return __x8__
  }"""), this)
}
