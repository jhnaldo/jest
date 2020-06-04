package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MulOperation extends Algorithm {
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MulOperation" (op, lnum, rnum) => {
    if (= op "*") {
      return ( * lnum rnum )
    } else if (= op "/") {
      return ( / lnum rnum )
    } else if (= op "%") {
      return ( % lnum rnum )
    } else {
      return undefined
    }
  }"""))
}
