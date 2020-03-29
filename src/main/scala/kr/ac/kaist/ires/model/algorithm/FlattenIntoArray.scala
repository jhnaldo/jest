package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FlattenIntoArray {
  val length: Int = 5
  val func: Func = parseFunc(""""FlattenIntoArray" (target, source, sourceLen, start, depth, mapperFunction, thisArg) => {
    app __x0__ = (Type target)
    assert (= __x0__ Object)
    app __x1__ = (Type source)
    assert (= __x1__ Object)
    let targetIndex = start
    let sourceIndex = 0i
    while (< sourceIndex sourceLen) {
      app __x2__ = (ToString sourceIndex)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let P = __x2__
      app __x3__ = (HasProperty source P)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let exists = __x3__
      if (= exists true) {
        app __x4__ = (Get source P)
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let element = __x4__
        if (! (= mapperFunction absent)) {
          app __x5__ = (Call mapperFunction thisArg (new [element, sourceIndex, source]))
          if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          element = __x5__
        } else {}
        let shouldFlatten = false
        if (< 0i depth) {
          app __x6__ = (IsArray element)
          if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          shouldFlatten = __x6__
        } else {}
        if (= shouldFlatten true) {
          app __x7__ = (LengthOfArrayLike element)
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          let elementLen = __x7__
          app __x8__ = (FlattenIntoArray target element elementLen targetIndex (- depth 1i))
          if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
          targetIndex = __x8__
        } else {
          if (! (< targetIndex (- 9007199254740992i 1i))) {
            app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x9__
          } else {}
          app __x10__ = (ToString targetIndex)
          if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          app __x11__ = (CreateDataPropertyOrThrow target __x10__ element)
          if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          __x11__
          targetIndex = (+ targetIndex 1i)
        }
      } else {}
      sourceIndex = (+ sourceIndex 1i)
    }
    app __x12__ = (WrapCompletion targetIndex)
    return __x12__
  }""")
}
