package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectEnvironmentRecordDOTHasBinding extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""ObjectEnvironmentRecord.HasBinding" (this, N) => {
    let envRec = this
    let bindings = envRec["BindingObject"]
    app __x0__ = (HasProperty bindings N)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let foundBinding = __x0__
    if (= foundBinding false) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= envRec["withEnvironment"] false) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (Get bindings SYMBOL_unscopables)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let unscopables = __x3__
    app __x4__ = (Type unscopables)
    if (= __x4__ Object) {
      app __x5__ = (Get unscopables N)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      app __x6__ = (ToBoolean __x5__)
      let blocked = __x6__
      if (= blocked true) {
        app __x7__ = (WrapCompletion false)
        return __x7__
      } else {}
    } else {}
    app __x8__ = (WrapCompletion true)
    return __x8__
  }""")
}
