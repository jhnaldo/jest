package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
object BoundFunctionExoticObject {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("Set") -> OrdinaryObjectDOTSet.func),
    (Str("SetPrototypeOf") -> OrdinaryObjectDOTSetPrototypeOf.func),
    (Str("Get") -> OrdinaryObjectDOTGet.func),
    (Str("PreventExtensions") -> OrdinaryObjectDOTPreventExtensions.func),
    (Str("Construct") -> BoundFunctionExoticObjectDOTConstruct.func),
    (Str("Delete") -> OrdinaryObjectDOTDelete.func),
    (Str("GetOwnProperty") -> OrdinaryObjectDOTGetOwnProperty.func),
    (Str("Call") -> BoundFunctionExoticObjectDOTCall.func),
    (Str("IsExtensible") -> OrdinaryObjectDOTIsExtensible.func),
    (Str("HasProperty") -> OrdinaryObjectDOTHasProperty.func),
    (Str("DefineOwnProperty") -> OrdinaryObjectDOTDefineOwnProperty.func),
    (Str("OwnPropertyKeys") -> OrdinaryObjectDOTOwnPropertyKeys.func),
    (Str("GetPrototypeOf") -> OrdinaryObjectDOTGetPrototypeOf.func)
  ) ++ BaseType.getMap("BoundFunctionExoticObject")
}
