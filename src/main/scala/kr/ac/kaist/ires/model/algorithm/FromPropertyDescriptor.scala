package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FromPropertyDescriptor extends Algorithm {
  val name: String = "FromPropertyDescriptor"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FromPropertyDescriptor" (Desc) => {
    if (= Desc undefined) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    app __x1__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x1__
    if (! (= Desc["Value"] absent)) {
      app __x2__ = (CreateDataProperty obj "value" Desc["Value"])
      __x2__
    } else {}
    if (! (= Desc["Writable"] absent)) {
      app __x3__ = (CreateDataProperty obj "writable" Desc["Writable"])
      __x3__
    } else {}
    if (! (= Desc["Get"] absent)) {
      app __x4__ = (CreateDataProperty obj "get" Desc["Get"])
      __x4__
    } else {}
    if (! (= Desc["Set"] absent)) {
      app __x5__ = (CreateDataProperty obj "set" Desc["Set"])
      __x5__
    } else {}
    if (! (= Desc["Enumerable"] absent)) {
      app __x6__ = (CreateDataProperty obj "enumerable" Desc["Enumerable"])
      __x6__
    } else {}
    if (! (= Desc["Configurable"] absent)) {
      app __x7__ = (CreateDataProperty obj "configurable" Desc["Configurable"])
      __x7__
    } else {}
    app __x8__ = (WrapCompletion obj)
    return __x8__
  }"""), this)
}
