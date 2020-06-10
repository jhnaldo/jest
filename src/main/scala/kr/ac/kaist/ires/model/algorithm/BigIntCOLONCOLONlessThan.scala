package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONlessThan extends Algorithm {
  val name: String = "BigIntCOLONCOLONlessThan"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigIntCOLONCOLONlessThan" (x, y) => return (< x y)"""), this)
}
