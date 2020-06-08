package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Encode extends Algorithm {
  val name: String = "Encode"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""Encode" (string, unescapedSet) => {
    let strLen = string["length"]
    let R = ""
    let k = 0i
    while true {
      if (= k strLen) {
        app __x0__ = (WrapCompletion R)
        return __x0__
      } else {}
      !!! "Etc"
      if (contains unescapedSet C) {
        k = (+ k 1i)
        R = (+ R C)
      } else {
        app __x1__ = (CodePointAt string k)
        if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
        let cp = __x1__
        if (= cp["IsUnpairedSurrogate"] true) {
          app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_URIErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x2__
        } else {}
        k = (+ k cp["CodeUnitCount"])
        !!! "Let id:{Octets} be the List of octets resulting by applying the UTF - 8 transformation to id:{cp} . [ [ CodePoint ] ] ."
        let __x3__ = Octets
        let __x4__ = 0i
        while (< __x4__ __x3__["length"]) {
          let octet = __x3__[__x4__]
          !!! "Etc"
          __x4__ = (+ __x4__ 1i)
        }
      }
    }
  }"""), this)
}
