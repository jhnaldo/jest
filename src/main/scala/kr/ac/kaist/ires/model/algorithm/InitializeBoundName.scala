package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object InitializeBoundName {
  val length: Int = 3
  val func: Func = parseFunc(""""InitializeBoundName" (name, value, environment) => {
    app __x0__ = (Type name)
    assert (= __x0__ String)
    if (! (= environment undefined)) {
      let env = environment["EnvironmentRecord"]
      app __x1__ = (env["InitializeBinding"] env name value)
      __x1__
      app __x2__ = (NormalCompletion undefined)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {
      app __x4__ = (ResolveBinding name)
      let lhs = __x4__
      app __x5__ = (PutValue lhs value)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    }
  }""")
}
