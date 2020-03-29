package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionCreate {
  val length: Int = 4
  val func: Func = parseFunc(""""AsyncFunctionCreate" (kind, parameters, body, Scope) => {
    let functionPrototype = INTRINSIC_AsyncFunctionPrototype
    app __x0__ = (FunctionAllocate functionPrototype "async")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let F = __x0__
    app __x1__ = (FunctionInitialize F kind parameters body Scope)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
