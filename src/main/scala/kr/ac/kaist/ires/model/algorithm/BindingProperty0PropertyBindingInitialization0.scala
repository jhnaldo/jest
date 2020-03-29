package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingProperty0PropertyBindingInitialization0 {
  val length: Int = 0
  val func: Func = parseFunc(""""BindingProperty0PropertyBindingInitialization0" (this, SingleNameBinding, value, environment) => {
    access __x0__ = (SingleNameBinding "BoundNames")
    access __x1__ = (__x0__ 0i)
    let name = __x1__
    access __x2__ = (SingleNameBinding "KeyedBindingInitialization")
    app __x3__ = (__x2__ value environment name)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion (new [name]))
    return __x4__
  }""")
}
