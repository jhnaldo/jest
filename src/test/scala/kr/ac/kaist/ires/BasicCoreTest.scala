package kr.ac.kaist.ires

import java.io._
import kr.ac.kaist.ires.core._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.phase._
import org.scalatest._
import scala.util.Random.shuffle

class BasicCoreTest extends CoreTest {
  // tag name
  val tag: String = "coreTest"

  // basic core files
  val coreDir = s"$TEST_DIR/core"

  // registration
  for (file <- shuffle(walkTree(new File(coreDir)))) {
    val filename = file.getName
    if (coreFilter(filename)) {
      lazy val name = file.toString
      lazy val config = aseConfig.copy(fileNames = List(name))

      lazy val pgm = ParseCore((), config)
      check("CoreParse", filename, parseCoreTest(pgm))

      lazy val st = EvalCore(LoadCore(pgm, config), config)
      check("CoreEval", filename, evalCoreTest(st))
    }
  }
}
