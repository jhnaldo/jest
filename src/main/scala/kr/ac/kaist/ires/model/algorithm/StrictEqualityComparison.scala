package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StrictEqualityComparison extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""StrictEqualityComparison" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (! (= __x0__ __x1__)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (Type x)
    if (= __x3__ Number) {
      if (= x NaN) {
        app __x4__ = (WrapCompletion false)
        return __x4__
      } else {}
      if (= y NaN) {
        app __x5__ = (WrapCompletion false)
        return __x5__
      } else {}
      if (= x y) {
        app __x6__ = (WrapCompletion true)
        return __x6__
      } else {}
      if (&& (= x 0i) (= y -0.0)) {
        app __x7__ = (WrapCompletion true)
        return __x7__
      } else {}
      if (&& (= x -0.0) (= y 0i)) {
        app __x8__ = (WrapCompletion true)
        return __x8__
      } else {}
      app __x9__ = (WrapCompletion false)
      return __x9__
    } else {}
    app __x10__ = (SameValueNonNumber x y)
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }""")
}
