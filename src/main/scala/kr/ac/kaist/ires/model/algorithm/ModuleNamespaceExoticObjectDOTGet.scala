package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTGet extends Algorithm {
  val name: String = "ModuleNamespaceExoticObjectDOTGet"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleNamespaceExoticObject.Get" (O, P, Receiver) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (= __x1__ Symbol) {
      app __x2__ = (OrdinaryGet O P Receiver)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    let exports = O["Exports"]
    if (! (contains exports P)) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    let m = O["Module"]
    app __x5__ = (m["ResolveExport"] m P (new []))
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let binding = __x5__
    assert (= (typeof binding) "ResolvedBindingRecord")
    let targetModule = binding["Module"]
    assert (! (= targetModule undefined))
    let targetEnv = targetModule["Environment"]
    if (= targetEnv undefined) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    let targetEnvRec = targetEnv["EnvironmentRecord"]
    app __x7__ = (targetEnvRec["GetBindingValue"] targetEnvRec binding["BindingName"] true)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }"""), this)
}
