package kr.ac.kaist.ires

import java.io._
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.spec._
import kr.ac.kaist.ires.util.Useful._
import org.scalatest._
import scala.util.Random.shuffle
import scala.util.{ Failure, Success, Try }

class GrammarDiffTest extends CoreTest {
  // tag name
  val tag: String = "grammarDiffTest"

  def getDiffSize[A, B](old: Map[A, B], cur: Map[A, B]): Int = cur.foldLeft(0) {
    case (count, (k, v)) => old.get(k) match {
      case Some(oldV) => if (oldV == v) count else count + 1
      case None => count + 1
    }
  }

  // registration
  def init: Unit = {
    val m = Map[String, Production]()
    DIFFLIST.foldLeft((m, m)) {
      case ((prevLexMap, prevSynMap), version) =>
        val spec = Spec(s"$RESOURCE_DIR/$version/auto/spec.json")
        val Grammar(lexProds, synProds) = spec.grammar

        val lexMap = lexProds.map(prod => prod.lhs.name -> prod).toMap
        val synMap = synProds.map(prod => prod.lhs.name -> prod).toMap

        val diffLexSize = getDiffSize(prevLexMap, lexMap)
        val diffSynSize = getDiffSize(prevSynMap, synMap)

        println(s"diff : $diffLexSize, $diffSynSize")
        println(s"$version : ${lexMap.size}, ${synMap.size}")

        (lexMap, synMap)
    }
  }
  check("GrammarDiffTest", "All", init)
}
