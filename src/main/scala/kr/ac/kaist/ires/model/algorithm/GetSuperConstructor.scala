package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetSuperConstructor extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""GetSuperConstructor" () => {
    app __x0__ = (GetThisEnvironment )
    let envRec = __x0__
    assert (= (typeof envRec) "FunctionEnvironmentRecord")
    let activeFunction = envRec["FunctionObject"]
    app __x1__ = (activeFunction["GetPrototypeOf"] activeFunction)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let superConstructor = __x1__
    app __x2__ = (IsConstructor superConstructor)
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion superConstructor)
    return __x4__
  }""")
}
