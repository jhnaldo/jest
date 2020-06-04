package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsAbruptCompletion extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""IsAbruptCompletion" (x) => {
  return (&& (is-completion x) (! (= x.Type CONST_normal)))
  }""")
}
