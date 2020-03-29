package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateStringIterator {
  val length: Int = 1
  val func: Func = parseFunc(""""CreateStringIterator" (string) => {
    app __x0__ = (Type string)
    assert (= __x0__ String)
    app __x1__ = (ObjectCreate INTRINSIC_StringIteratorPrototype (new ["IteratedString", "StringIteratorNextIndex"]))
    let iterator = __x1__
    iterator["IteratedString"] = string
    iterator["StringIteratorNextIndex"] = 0i
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }""")
}
