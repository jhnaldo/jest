package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingRestProperty0RestBindingInitialization0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""BindingRestProperty0RestBindingInitialization0" (this, BindingIdentifier, value, environment, excludedNames) => {
    access __x0__ = (BindingIdentifier "StringValue")
    app __x1__ = (ResolveBinding __x0__ environment)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    app __x2__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let restObj = __x2__
    app __x3__ = (CopyDataProperties restObj value excludedNames)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    if (= environment undefined) {
      app __x4__ = (PutValue lhs restObj)
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (InitializeReferencedBinding lhs restObj)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }""")
}
