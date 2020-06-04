package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayExoticObjectDOTDefineOwnProperty extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""ArrayExoticObject.DefineOwnProperty" (A, P, Desc) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    if (= P "length") {
      app __x1__ = (ArraySetLength A Desc)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {
      app __x3__ = (IsArrayIndex P)
      if __x3__ {
        app __x4__ = (OrdinaryGetOwnProperty A "length")
        let oldLenDesc = __x4__
        let oldLen = oldLenDesc["Value"]
        app __x5__ = (ToUint32 P)
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        let index = __x5__
        if (&& (! (< index oldLen)) (= oldLenDesc["Writable"] false)) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        app __x7__ = (OrdinaryDefineOwnProperty A P Desc)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let succeeded = __x7__
        if (= succeeded false) {
          app __x8__ = (WrapCompletion false)
          return __x8__
        } else {}
        if (! (< index oldLen)) {
          oldLenDesc["Value"] = (+ index 1i)
          app __x9__ = (OrdinaryDefineOwnProperty A "length" oldLenDesc)
          let succeeded = __x9__
          assert (= succeeded true)
        } else {}
        app __x10__ = (WrapCompletion true)
        return __x10__
      } else {}
    }
    app __x11__ = (OrdinaryDefineOwnProperty A P Desc)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }""")
}
