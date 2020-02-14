package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorDeclaration1InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration1InstantiateFunctionObject0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""GeneratorBody"""), Id("""scope""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""GeneratorBody"""))), ERef(RefId(Id("""scope"""))))), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_GeneratorPrototype"""))))), ILet(Id("""prototype"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))), IExpr(ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), EStr("""default"""))), IExpr(ERef(RefId(Id("""__x3__""")))), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "GeneratorDeclaration1InstantiateFunctionObject0" (this, FormalParameters, GeneratorBody, scope) => {
    app __x0__ = (GeneratorFunctionCreate CONST_Normal FormalParameters GeneratorBody scope)
    let F = __x0__
    app __x1__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
    let prototype = __x1__
    app __x2__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x2__
    app __x3__ = (SetFunctionName F "default")
    __x3__
    F["SourceText"] = (get-syntax this)
    app __x4__ = (WrapCompletion F)
    return __x4__
  }
  */
}
