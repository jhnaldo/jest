package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTCreateImmutableBinding extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""GlobalEnvironmentRecord.CreateImmutableBinding" (this, N, S) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (DclRec["CreateImmutableBinding"] DclRec N S)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
