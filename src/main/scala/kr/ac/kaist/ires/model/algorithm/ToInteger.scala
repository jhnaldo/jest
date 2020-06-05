package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToInteger extends Algorithm {
  val name: String = "ToInteger"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToInteger" (argument) => {
    app __x0__ = (ToNumber argument)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (= number NaN) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    if (|| (|| (|| (= number 0i) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x2__ = (WrapCompletion number)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion (convert number num2int ))
    return __x3__
  }"""), this)
}
