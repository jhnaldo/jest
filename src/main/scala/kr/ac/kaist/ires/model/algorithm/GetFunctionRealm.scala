package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetFunctionRealm {
  val length: Int = 1
  val func: Func = parseFunc(""""GetFunctionRealm" (obj) => {
    if (! (= obj["Realm"] absent)) {
      app __x0__ = (WrapCompletion obj["Realm"])
      return __x0__
    } else {}
    if (= (typeof obj) "BoundFunctionExoticObject") {
      let target = obj["BoundTargetFunction"]
      app __x1__ = (GetFunctionRealm target)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    if (= (typeof obj) "ProxyExoticObject") {
      if (= obj["ProxyHandler"] null) {
        app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x3__
      } else {}
      let proxyTarget = obj["ProxyTarget"]
      app __x4__ = (GetFunctionRealm proxyTarget)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (WrapCompletion REALM)
    return __x6__
  }""")
}
