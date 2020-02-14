package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTHasSuperBinding {
  val length: Int = 0
  val func: Func = Func("""DeclarativeEnvironmentRecord.HasSuperBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.HasSuperBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
