package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RequireObjectCoercible extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""RequireObjectCoercible" (argument) => {
    if (|| (= (typeof argument) "Undefined") (= (typeof argument) "Null")) {
      return (new Completion (
        "Type" -> CONST_throw,
        "Value" -> (new OrdinaryObject(
          "Prototype" -> INTRINSIC_TypeErrorPrototype,
          "ErrorData" -> undefined,
          "SubMap" -> (new SubMap())
        )),
        "Target" -> CONST_empty
      ))
    } else {
      return argument
    }
  }""")
}
