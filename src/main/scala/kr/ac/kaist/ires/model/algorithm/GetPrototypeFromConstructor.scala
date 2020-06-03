package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetPrototypeFromConstructor {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""GetPrototypeFromConstructor" (constructor, intrinsicDefaultProto) => {
    app __x0__ = (IsCallable constructor)
    assert (= __x0__ true)
    app __x1__ = (Get constructor "prototype")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let proto = __x1__
    app __x2__ = (Type proto)
    if (! (= __x2__ Object)) {
      app __x3__ = (GetFunctionRealm constructor)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let realm = __x3__
      proto = intrinsicDefaultProto
    } else {}
    app __x4__ = (WrapCompletion proto)
    return __x4__
  }""")
}
