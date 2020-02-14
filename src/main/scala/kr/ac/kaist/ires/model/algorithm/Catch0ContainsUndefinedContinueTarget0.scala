package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""Catch0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsUndefinedContinueTarget""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "Catch0ContainsUndefinedContinueTarget0" (this, CatchParameter, Block, iterationSet, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
