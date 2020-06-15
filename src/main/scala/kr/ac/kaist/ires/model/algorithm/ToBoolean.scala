package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToBoolean extends Algorithm {
  val name: String = "ToBoolean"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToBoolean" (argument) => {
    app atype = (Type argument)
    if (= atype "Undefined") {
      return false
    } else if (= atype "Null") {
      return false
    } else if (= atype "Boolean") {
      return argument
    } else if (= atype "Number") {
      if (|| (|| (= argument 0.0) (= argument (- 0.0))) (= argument NaN)) return false
      else return true
    } else if (= atype "String") {
      if (= argument "") return false
      else return true
    } else if (= atype "Symbol") {
      return true
    } else if (= atype "BigInt") {
      return (! (= argument 0n))
    } else {
      return true
    }
  }"""), this)
}
