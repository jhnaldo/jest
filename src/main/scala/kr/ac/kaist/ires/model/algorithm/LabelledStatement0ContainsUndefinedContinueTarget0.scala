package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledStatement0ContainsUndefinedContinueTarget0 extends Algorithm {
  val name: String = "LabelledStatement0ContainsUndefinedContinueTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelledStatement0ContainsUndefinedContinueTarget0" (this, LabelIdentifier, LabelledItem, iterationSet, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    let __x1__ = (copy-obj labelSet)
    append label -> __x1__
    let newLabelSet = __x1__
    access __x2__ = (LabelledItem "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet newLabelSet)
    return __x3__
  }"""), this)
}
