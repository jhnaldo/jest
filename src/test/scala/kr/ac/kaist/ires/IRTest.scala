package kr.ac.kaist.ires

import java.io._
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.phase._
import org.scalatest._
import scala.util.Random.shuffle

abstract class IRTest extends IRESTest {
  // tests for ir-parser
  def parseIRTest(pgm: => Program): Unit = {
    val newPgm = Parser.parseProgram(beautify(pgm))
    assert(pgm == newPgm)
  }
  def parseIRFuncTest(func: => Func): Unit = {
    val newFunc = Parser.parseFunc(beautify(func))
    assert(func == newFunc)
  }

  // tests for ir-interpreter
  def evalIRTest(st: => State): Unit = st
}
