package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateMappedArgumentsObject extends Algorithm {
  val length: Int = 4
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateMappedArgumentsObject" (func, formals, argumentsList, env) => {
    let len = argumentsList["length"]
    let obj = (new ArgumentsExoticObject("SubMap" -> (new SubMap()), "ParameterMap" -> undefined))
    obj["GetOwnProperty"] = ArgumentsExoticObjectDOTGetOwnProperty
    obj["DefineOwnProperty"] = ArgumentsExoticObjectDOTDefineOwnProperty
    obj["Get"] = ArgumentsExoticObjectDOTGet
    obj["Set"] = ArgumentsExoticObjectDOTSet
    obj["Delete"] = ArgumentsExoticObjectDOTDelete
    if (= obj["HasProperty"] absent) obj["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= obj["DefineOwnProperty"] absent) obj["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= obj["Set"] absent) obj["Set"] = OrdinaryObjectDOTSet else {}
    if (= obj["SetPrototypeOf"] absent) obj["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= obj["Get"] absent) obj["Get"] = OrdinaryObjectDOTGet else {}
    if (= obj["PreventExtensions"] absent) obj["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= obj["Delete"] absent) obj["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= obj["GetOwnProperty"] absent) obj["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= obj["OwnPropertyKeys"] absent) obj["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= obj["GetPrototypeOf"] absent) obj["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= obj["IsExtensible"] absent) obj["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    obj["Prototype"] = INTRINSIC_ObjectPrototype
    obj["Extensible"] = true
    app __x0__ = (ObjectCreate null)
    let map = __x0__
    obj["ParameterMap"] = map
    access __x1__ = (formals "BoundNames")
    let parameterNames = __x1__
    let numberOfParameters = parameterNames["length"]
    let index = 0i
    while (< index len) {
      let val = argumentsList[index]
      app __x2__ = (ToString index)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (CreateDataProperty obj __x2__ val)
      __x3__
      index = (+ index 1i)
    }
    app __x4__ = (DefinePropertyOrThrow obj "length" (new PropertyDescriptor("Value" -> len, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    __x4__
    let mappedNames = (new [])
    let index = (- numberOfParameters 1i)
    while (! (< index 0i)) {
      let name = parameterNames[index]
      if (! (contains mappedNames name)) {
        append name -> mappedNames
        if (< index len) {
          app __x5__ = (MakeArgGetter name env)
          let g = __x5__
          app __x6__ = (MakeArgSetter name env)
          let p = __x6__
          app __x7__ = (ToString index)
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          app __x8__ = (map["DefineOwnProperty"] map __x7__ (new PropertyDescriptor("Set" -> p, "Get" -> g, "Enumerable" -> false, "Configurable" -> true)))
          __x8__
        } else {}
      } else {}
      index = (- index 1i)
    }
    app __x9__ = (DefinePropertyOrThrow obj SYMBOL_iterator (new PropertyDescriptor("Value" -> INTRINSIC_ArrayProto_values, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    __x9__
    app __x10__ = (DefinePropertyOrThrow obj "callee" (new PropertyDescriptor("Value" -> func, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    __x10__
    app __x11__ = (WrapCompletion obj)
    return __x11__
  }"""))
}
