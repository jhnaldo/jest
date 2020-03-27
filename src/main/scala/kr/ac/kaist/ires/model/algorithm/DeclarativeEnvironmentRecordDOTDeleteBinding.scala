package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTDeleteBinding {
  val length: Int = 1
  val func: Func = Func("""DeclarativeEnvironmentRecord.DeleteBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))), IAssert(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N"""))))), EAbsent))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    assert (! (= envRec["SubMap"][N] absent))
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}