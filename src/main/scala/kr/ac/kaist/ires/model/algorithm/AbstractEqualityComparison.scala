package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AbstractEqualityComparison {
  val length: Int = 0
  val func: Func = parseFunc(""""AbstractEqualityComparison" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (= __x0__ __x1__) {
      app __x2__ = (StrictEqualityComparison x y)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    if (&& (= x null) (= y undefined)) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    if (&& (= x undefined) (= y null)) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    app __x6__ = (Type x)
    let __x7__ = (= __x6__ Number)
    if __x7__ {
      app __x8__ = (Type y)
      __x7__ = (= __x8__ String)
    } else {}
    if __x7__ {
      app __x9__ = (ToNumber y)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      app __x10__ = (AbstractEqualityComparison x __x9__)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (Type x)
    let __x13__ = (= __x12__ String)
    if __x13__ {
      app __x14__ = (Type y)
      __x13__ = (= __x14__ Number)
    } else {}
    if __x13__ {
      app __x15__ = (ToNumber x)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      app __x16__ = (AbstractEqualityComparison __x15__ y)
      app __x17__ = (WrapCompletion __x16__)
      return __x17__
    } else {}
    app __x18__ = (Type x)
    if (= __x18__ Boolean) {
      app __x19__ = (ToNumber x)
      if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      app __x20__ = (AbstractEqualityComparison __x19__ y)
      app __x21__ = (WrapCompletion __x20__)
      return __x21__
    } else {}
    app __x22__ = (Type y)
    if (= __x22__ Boolean) {
      app __x23__ = (ToNumber y)
      if (is-completion __x23__) if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
      app __x24__ = (AbstractEqualityComparison x __x23__)
      app __x25__ = (WrapCompletion __x24__)
      return __x25__
    } else {}
    app __x26__ = (Type x)
    let __x27__ = (|| (|| (= __x26__ String) (= __x26__ Number)) (= __x26__ Symbol))
    if __x27__ {
      app __x28__ = (Type y)
      __x27__ = (= __x28__ Object)
    } else {}
    if __x27__ {
      app __x29__ = (ToPrimitive y)
      if (is-completion __x29__) if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
      app __x30__ = (AbstractEqualityComparison x __x29__)
      app __x31__ = (WrapCompletion __x30__)
      return __x31__
    } else {}
    app __x32__ = (Type x)
    let __x33__ = (= __x32__ Object)
    if __x33__ {
      app __x34__ = (Type y)
      __x33__ = (|| (|| (= __x34__ String) (= __x34__ Number)) (= __x34__ Symbol))
    } else {}
    if __x33__ {
      app __x35__ = (ToPrimitive x)
      if (is-completion __x35__) if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
      app __x36__ = (AbstractEqualityComparison __x35__ y)
      app __x37__ = (WrapCompletion __x36__)
      return __x37__
    } else {}
    app __x38__ = (WrapCompletion false)
    return __x38__
  }""")
}
