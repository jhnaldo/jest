package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGetCapabilitiesExecutorFunctions {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.GetCapabilitiesExecutorFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let resolve = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let reject = __x1__
    let F = GLOBAL_context["Function"]
    let promiseCapability = F["Capability"]
    if (! (= promiseCapability["Resolve"] undefined)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    if (! (= promiseCapability["Reject"] undefined)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    promiseCapability["Resolve"] = resolve
    promiseCapability["Reject"] = reject
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }""")
}
