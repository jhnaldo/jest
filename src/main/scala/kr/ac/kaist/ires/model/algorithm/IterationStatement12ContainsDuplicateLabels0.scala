package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement12ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement12ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "IterationStatement12ContainsDuplicateLabels0" (this, ForBinding, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
