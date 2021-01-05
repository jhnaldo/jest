package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectBindingPattern0BindingInitialization0 extends Algorithm {
  val name: String = "ObjectBindingPattern0BindingInitialization0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectBindingPattern0BindingInitialization0" (this, value, environment) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}