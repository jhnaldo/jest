package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTBigIntDOTasIntN extends Algorithm {
  val name: String = "GLOBALDOTBigIntDOTasIntN"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.BigInt.asIntN" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let bits = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let bigint = __x1__
    app __x2__ = (ToIndex bits)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let bits = __x2__
    app __x3__ = (ToBigInt bigint)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let bigint = __x3__
    let mod = (%% bigint (** 2n bits))
    if (! (< mod (** 2n (- bits 1)))) return (- mod (** 2n bits)) else return mod
  }"""), this)
}