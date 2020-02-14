package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorMethod0HasDirectSuper0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorMethod0HasDirectSuper0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""AsyncGeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UniqueFormalParameters"""))), EStr("""Contains""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EStr("""SuperCall"""))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)), ISeq(List())), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AsyncGeneratorBody"""))), EStr("""Contains""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(EStr("""SuperCall"""))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "AsyncGeneratorMethod0HasDirectSuper0" (this, PropertyName, UniqueFormalParameters, AsyncGeneratorBody) => {
    access __x0__ = (UniqueFormalParameters "Contains")
    app __x1__ = (__x0__ "SuperCall")
    if (= __x1__ true) return true else {}
    access __x2__ = (AsyncGeneratorBody "Contains")
    app __x3__ = (__x2__ "SuperCall")
    return __x3__
  }
  */
}
