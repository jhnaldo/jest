package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsPromise extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""IsPromise" (x) => {
    app __x0__ = (Type x)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= x["PromiseState"] absent) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion true)
    return __x3__
  }""")
}
