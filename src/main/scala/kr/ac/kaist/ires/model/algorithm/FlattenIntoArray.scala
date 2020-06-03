package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FlattenIntoArray {
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = parseFunc(""""FlattenIntoArray" (target, source, sourceLen, start, depth, mapperFunction, thisArg) => {
    let targetIndex = start
    let sourceIndex = 0i
    while (< sourceIndex sourceLen) {
      app __x0__ = (ToString sourceIndex)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let P = __x0__
      app __x1__ = (HasProperty source P)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let exists = __x1__
      if (= exists true) {
        app __x2__ = (Get source P)
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let element = __x2__
        if (! (= mapperFunction absent)) {
          assert (! (= thisArg absent))
          app __x3__ = (Call mapperFunction thisArg (new [element, sourceIndex, source]))
          if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
          element = __x3__
        } else {}
        let shouldFlatten = false
        if (< 0i depth) {
          app __x4__ = (IsArray element)
          if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
          shouldFlatten = __x4__
        } else {}
        if (= shouldFlatten true) {
          app __x5__ = (Get element "length")
          if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          app __x6__ = (ToLength __x5__)
          if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          let elementLen = __x6__
          app __x7__ = (FlattenIntoArray target element elementLen targetIndex (- depth 1i))
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          targetIndex = __x7__
        } else {
          if (! (< targetIndex (- 9007199254740992i 1i))) {
            app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x8__
          } else {}
          app __x9__ = (ToString targetIndex)
          if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
          app __x10__ = (CreateDataPropertyOrThrow target __x9__ element)
          if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          __x10__
          targetIndex = (+ targetIndex 1i)
        }
      } else {}
      sourceIndex = (+ sourceIndex 1i)
    }
    app __x11__ = (WrapCompletion targetIndex)
    return __x11__
  }""")
}
