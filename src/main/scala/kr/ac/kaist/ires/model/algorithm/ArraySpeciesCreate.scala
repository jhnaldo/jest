package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArraySpeciesCreate extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArraySpeciesCreate" (originalArray, length) => {
    if (= length -0.0) length = 0i else {}
    app __x0__ = (IsArray originalArray)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let isArray = __x0__
    if (= isArray false) {
      app __x1__ = (ArrayCreate length)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    app __x3__ = (Get originalArray "constructor")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let C = __x3__
    app __x4__ = (IsConstructor C)
    if (= __x4__ true) {
      let thisRealm = REALM
      app __x5__ = (GetFunctionRealm C)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let realmC = __x5__
      if (! (= thisRealm realmC)) {
        app __x6__ = (SameValue C realmC["Intrinsics"]["INTRINSIC_Array"])
        if (= __x6__ true) C = undefined else {}
      } else {}
    } else {}
    app __x7__ = (Type C)
    if (= __x7__ Object) {
      app __x8__ = (Get C SYMBOL_species)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      C = __x8__
      if (= C null) C = undefined else {}
    } else {}
    if (= C undefined) {
      app __x9__ = (ArrayCreate length)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      app __x10__ = (WrapCompletion __x9__)
      return __x10__
    } else {}
    app __x11__ = (IsConstructor C)
    if (= __x11__ false) {
      app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x12__
    } else {}
    app __x13__ = (Construct C (new [length]))
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    app __x14__ = (WrapCompletion __x13__)
    return __x14__
  }"""))
}
