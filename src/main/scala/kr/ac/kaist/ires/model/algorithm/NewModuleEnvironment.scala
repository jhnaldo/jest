package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewModuleEnvironment {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""NewModuleEnvironment" (E) => {
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    !!! "Etc"
    env["EnvironmentRecord"] = envRec
    env["Outer"] = E
    app __x0__ = (WrapCompletion env)
    return __x0__
  }""")
}
