package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTgetOwnPropertyDescriptors {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.Object.getOwnPropertyDescriptors" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (ToObject O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let obj = __x1__
    app __x2__ = (obj["OwnPropertyKeys"] obj)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let ownKeys = __x2__
    app __x3__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let descriptors = __x3__
    let __x4__ = ownKeys
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let key = __x4__[__x5__]
      app __x6__ = (obj["GetOwnProperty"] obj key)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let desc = __x6__
      app __x7__ = (FromPropertyDescriptor desc)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let descriptor = __x7__
      if (! (= descriptor undefined)) {
        app __x8__ = (CreateDataProperty descriptors key descriptor)
        if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        __x8__
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x9__ = (WrapCompletion descriptors)
    return __x9__
  }""")
}
