package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTflat {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.flat" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let depth = __x0__
    app __x1__ = (ToObject this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (Get O "length")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (ToLength __x2__)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let sourceLen = __x3__
    let depthNum = 1i
    if (! (= depth undefined)) {
      app __x4__ = (ToInteger depth)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      depthNum = __x4__
    } else {}
    app __x5__ = (ArraySpeciesCreate O 0i)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let A = __x5__
    app __x6__ = (FlattenIntoArray A O sourceLen 0i depthNum)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    __x6__
    app __x7__ = (WrapCompletion A)
    return __x7__
  }""")
}
