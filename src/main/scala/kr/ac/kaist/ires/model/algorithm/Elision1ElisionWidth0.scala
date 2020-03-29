package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Elision1ElisionWidth0 {
  val length: Int = 0
  val func: Func = parseFunc(""""Elision1ElisionWidth0" (this, Elision) => {
    access __x0__ = (Elision "ElisionWidth")
    let preceding = __x0__
    return (+ preceding 1i)
  }""")
}
