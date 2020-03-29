package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTSYMBOL_unscopables {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.SYMBOL_unscopables" (this, argumentsList, NewTarget) => {
    app __x0__ = (ObjectCreate null)
    let unscopableList = __x0__
    app __x1__ = (CreateDataProperty unscopableList "copyWithin" true)
    __x1__
    app __x2__ = (CreateDataProperty unscopableList "entries" true)
    __x2__
    app __x3__ = (CreateDataProperty unscopableList "fill" true)
    __x3__
    app __x4__ = (CreateDataProperty unscopableList "find" true)
    __x4__
    app __x5__ = (CreateDataProperty unscopableList "findIndex" true)
    __x5__
    app __x6__ = (CreateDataProperty unscopableList "flat" true)
    __x6__
    app __x7__ = (CreateDataProperty unscopableList "flatMap" true)
    __x7__
    app __x8__ = (CreateDataProperty unscopableList "includes" true)
    __x8__
    app __x9__ = (CreateDataProperty unscopableList "keys" true)
    __x9__
    app __x10__ = (CreateDataProperty unscopableList "values" true)
    __x10__
    app __x11__ = (WrapCompletion unscopableList)
    return __x11__
  }""")
}
