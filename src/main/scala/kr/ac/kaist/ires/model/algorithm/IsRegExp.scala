package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsRegExp {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""IsRegExp" (argument) => {
    app __x0__ = (Type argument)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (Get argument SYMBOL_match)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let matcher = __x2__
    if (! (= matcher undefined)) {
      app __x3__ = (ToBoolean matcher)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    if (! (= argument["RegExpMatcher"] absent)) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    app __x6__ = (WrapCompletion false)
    return __x6__
  }""")
}
