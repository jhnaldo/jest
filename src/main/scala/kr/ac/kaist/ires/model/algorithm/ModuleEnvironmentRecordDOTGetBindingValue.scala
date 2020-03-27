package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleEnvironmentRecordDOTGetBindingValue {
  val length: Int = 2
  val func: Func = Func("""ModuleEnvironmentRecord.GetBindingValue""", List(Id("""this"""), Id("""N"""), Id("""S""")), None, ISeq(List(IAssert(EBOp(OEq, ERef(RefId(Id("""S"""))), EBool(true))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IIf(EBOp(OEq, ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""initialized"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""BoundValue"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "ModuleEnvironmentRecord.GetBindingValue" (this, N, S) => {
    assert (= S true)
    !!! "Etc"
    !!! "Etc"
    if (= envRec["SubMap"][N]["initialized"] false) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion envRec["SubMap"][N]["BoundValue"])
    return __x1__
  }
  */
}