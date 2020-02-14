package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsAbruptCompletion {
  val func: Func = parseFunc(""""IsAbruptCompletion" (x) => {
    return (&& (= (typeof x) "Completion") (! (= x.Type CONST_normal)))
  }""")
}
