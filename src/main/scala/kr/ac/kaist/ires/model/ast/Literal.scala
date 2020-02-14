package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Literal extends AST {
  val kind: String = "Literal"
}
case class Literal0(x0: Lexical, parserParams: List[Boolean]) extends Literal {
  val name: String = "Literal0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = Literal0
}
object Literal0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> Literal0Evaluation0.func
  )
}
case class Literal1(x0: Lexical, parserParams: List[Boolean]) extends Literal {
  val name: String = "Literal1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = Literal1
}
object Literal1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> Literal1Evaluation0.func
  )
}
case class Literal2(x0: Lexical, parserParams: List[Boolean]) extends Literal {
  val name: String = "Literal2"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = Literal2
}
object Literal2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> Literal2Evaluation0.func
  )
}
case class Literal3(x0: Lexical, parserParams: List[Boolean]) extends Literal {
  val name: String = "Literal3"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = Literal3
}
object Literal3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> Literal3Evaluation0.func
  )
}
