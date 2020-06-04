package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsDuplicate extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""IsDuplicate" (list) => {
    let i = 0i
    let len = list.length
    while (< i len) {
      let j = (+ i 1i)
      while (< j len) {
        if (= list[i] list[j]) return true
        else {}
        j = (+ j 1i)
      }
      i = (+ i 1i)
    }
    return false
  }""")
}
