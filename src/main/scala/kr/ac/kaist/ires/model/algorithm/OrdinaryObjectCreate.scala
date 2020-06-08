package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryObjectCreate extends Algorithm {
  val name: String = "OrdinaryObjectCreate"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryObjectCreate" (proto, additionalInternalSlotsList) => {
    let internalSlotsList = (new ["Prototype", "Extensible"])
    !!! "If id:{additionalInternalSlotsList} is present , append each of its elements to id:{internalSlotsList} ."
    app __x0__ = (MakeBasicObject internalSlotsList)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    O["Prototype"] = proto
    app __x1__ = (WrapCompletion O)
    return __x1__
  }"""), this)
}
