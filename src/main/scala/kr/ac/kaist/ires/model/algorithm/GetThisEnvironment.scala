package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetThisEnvironment {
  val length: Int = 0
  val func: Func = parseFunc(""""GetThisEnvironment" () => {
    let lex = GLOBAL_context["LexicalEnvironment"]
    while true {
      let envRec = lex["EnvironmentRecord"]
      app __x0__ = (envRec["HasThisBinding"] envRec)
      let exists = __x0__
      if (= exists true) {
        app __x1__ = (WrapCompletion envRec)
        return __x1__
      } else {}
      let outer = lex["Outer"]
      assert (! (= outer null))
      lex = outer
    }
  }""")
}
