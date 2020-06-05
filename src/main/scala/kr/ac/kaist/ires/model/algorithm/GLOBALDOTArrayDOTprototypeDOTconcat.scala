package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTconcat extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTconcat"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.concat" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (ArraySpeciesCreate O 0i)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let A = __x1__
    let n = 0i
    prepend O -> argumentsList
    let items = argumentsList
    while (< 0i items["length"]) {
      let E = (pop items 0i)
      app __x2__ = (IsConcatSpreadable E)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let spreadable = __x2__
      if (= spreadable true) {
        let k = 0i
        app __x3__ = (Get E "length")
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        app __x4__ = (ToLength __x3__)
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let len = __x4__
        if (< (- 9007199254740992i 1i) (+ n len)) {
          app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x5__
        } else {}
        while (< k len) {
          app __x6__ = (ToString k)
          if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          let P = __x6__
          app __x7__ = (HasProperty E P)
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          let exists = __x7__
          if (= exists true) {
            app __x8__ = (Get E P)
            if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
            let subElement = __x8__
            app __x9__ = (ToString n)
            if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
            app __x10__ = (CreateDataPropertyOrThrow A __x9__ subElement)
            if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
            __x10__
          } else {}
          n = (+ n 1i)
          k = (+ k 1i)
        }
      } else {
        if (! (< n (- 9007199254740992i 1i))) {
          app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x11__
        } else {}
        app __x12__ = (ToString n)
        if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        app __x13__ = (CreateDataPropertyOrThrow A __x12__ E)
        if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
        n = (+ n 1i)
      }
    }
    app __x14__ = (Set A "length" n true)
    if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
    __x14__
    app __x15__ = (WrapCompletion A)
    return __x15__
  }"""), this)
}
