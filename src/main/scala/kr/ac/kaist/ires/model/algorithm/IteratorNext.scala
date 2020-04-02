package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IteratorNext {
  val length: Int = 1
  val func: Func = parseFunc(""""IteratorNext" (iteratorRecord, value) => {
    if (= value absent) {
      app __x0__ = (Call iteratorRecord["NextMethod"] iteratorRecord["Iterator"] (new []))
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let result = __x0__
    } else {
      app __x1__ = (Call iteratorRecord["NextMethod"] iteratorRecord["Iterator"] (new [value]))
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let result = __x1__
    }
    app __x2__ = (Type result)
    if (! (= __x2__ Object)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion result)
    return __x4__
  }""")
}
