package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTHasBinding {
  val length: Int = 1
  val func: Func = parseFunc(""""GlobalEnvironmentRecord.HasBinding" (this, N) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    let ObjRec = envRec["ObjectRecord"]
    app __x2__ = (ObjRec["HasBinding"] ObjRec N)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
