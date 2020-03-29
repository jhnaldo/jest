package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateUnmappedArgumentsObject {
  val length: Int = 1
  val func: Func = parseFunc(""""CreateUnmappedArgumentsObject" (argumentsList) => {
    let len = argumentsList["length"]
    app __x0__ = (ObjectCreate INTRINSIC_ObjectPrototype (new ["ParameterMap"]))
    let obj = __x0__
    obj["ParameterMap"] = undefined
    app __x1__ = (DefinePropertyOrThrow obj "length" (new PropertyDescriptor("Value" -> len, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    __x1__
    let index = 0i
    while (< index len) {
      let val = argumentsList[index]
      app __x2__ = (ToString index)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (CreateDataProperty obj __x2__ val)
      __x3__
      index = (+ index 1i)
    }
    app __x4__ = (DefinePropertyOrThrow obj SYMBOL_iterator (new PropertyDescriptor("Value" -> INTRINSIC_ArrayProto_values, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    __x4__
    app __x5__ = (DefinePropertyOrThrow obj "callee" (new PropertyDescriptor("Get" -> INTRINSIC_ThrowTypeError, "Set" -> INTRINSIC_ThrowTypeError, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion obj)
    return __x6__
  }""")
}
