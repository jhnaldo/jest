package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseResolve extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.PromiseResolve" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let C = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let x = __x1__
    app __x2__ = (Type C)
    assert (= __x2__ Object)
    app __x3__ = (IsPromise x)
    if (= __x3__ true) {
      app __x4__ = (Get x "constructor")
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let xConstructor = __x4__
      app __x5__ = (SameValue xConstructor C)
      if (= __x5__ true) {
        app __x6__ = (WrapCompletion x)
        return __x6__
      } else {}
    } else {}
    app __x7__ = (NewPromiseCapability C)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let promiseCapability = __x7__
    app __x8__ = (Call promiseCapability["Resolve"] undefined (new [x]))
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    __x8__
    app __x9__ = (WrapCompletion promiseCapability["Promise"])
    return __x9__
  }""")
}
