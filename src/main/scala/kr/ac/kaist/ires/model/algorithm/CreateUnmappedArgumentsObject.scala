package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateUnmappedArgumentsObject extends Algorithm {
  val name: String = "CreateUnmappedArgumentsObject"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateUnmappedArgumentsObject" (argumentsList) => {
    let len = argumentsList["length"]
    !!! "Let id:{obj} be OrdinaryObjectCreate ( % Object . prototype % , « [ [ ParameterMap ] ] » ) ."
    obj["ParameterMap"] = undefined
    app __x0__ = (DefinePropertyOrThrow obj "length" (new PropertyDescriptor("Value" -> len, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    __x0__
    let index = 0i
    while (< index len) {
      let val = argumentsList[index]
      app __x1__ = (ToString index)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (CreateDataPropertyOrThrow obj __x1__ val)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      index = (+ index 1i)
    }
    !!! "Perform ! DefinePropertyOrThrow ( id:{obj} , @ @ iterator , PropertyDescriptor { [ [ Value ] ] : % Array . prototype . values % , [ [ Writable ] ] : value:{true} , [ [ Enumerable ] ] : value:{false} , [ [ Configurable ] ] : value:{true} } ) ."
    app __x3__ = (DefinePropertyOrThrow obj "callee" (new PropertyDescriptor("Get" -> INTRINSIC_ThrowTypeError, "Set" -> INTRINSIC_ThrowTypeError, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion obj)
    return __x4__
  }"""), this)
}
