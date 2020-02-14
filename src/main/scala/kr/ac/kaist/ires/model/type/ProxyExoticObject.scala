package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object ProxyExoticObject {
  val map: Map[Value, Value] = Map(
    (Str("Set") -> ProxyExoticObjectDOTSet.func),
    (Str("SetPrototypeOf") -> ProxyExoticObjectDOTSetPrototypeOf.func),
    (Str("Get") -> ProxyExoticObjectDOTGet.func),
    (Str("PreventExtensions") -> ProxyExoticObjectDOTPreventExtensions.func),
    (Str("Construct") -> ProxyExoticObjectDOTConstruct.func),
    (Str("Delete") -> ProxyExoticObjectDOTDelete.func),
    (Str("GetOwnProperty") -> ProxyExoticObjectDOTGetOwnProperty.func),
    (Str("Call") -> ProxyExoticObjectDOTCall.func),
    (Str("IsExtensible") -> ProxyExoticObjectDOTIsExtensible.func),
    (Str("HasProperty") -> ProxyExoticObjectDOTHasProperty.func),
    (Str("DefineOwnProperty") -> ProxyExoticObjectDOTDefineOwnProperty.func),
    (Str("OwnPropertyKeys") -> ProxyExoticObjectDOTOwnPropertyKeys.func),
    (Str("GetPrototypeOf") -> ProxyExoticObjectDOTGetPrototypeOf.func)
  )
}
