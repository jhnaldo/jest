package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait NewExpression extends AST {
  val kind: String = "NewExpression"
}
case class NewExpression0(x0: MemberExpression, parserParams: List[Boolean]) extends NewExpression {
  x0.parent = Some(this)
  val name: String = "NewExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("MemberExpression", x0, Nil).reverse
  val info: ASTInfo = NewExpression0
}
object NewExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class NewExpression1(x1: NewExpression, parserParams: List[Boolean]) extends NewExpression {
  x1.parent = Some(this)
  val name: String = "NewExpression1"
  override def toString: String = {
    s"new $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("NewExpression", x1, Nil).reverse
  val info: ASTInfo = NewExpression1
}
object NewExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> NewExpression1AssignmentTargetType0.func,
    "Evaluation0" -> NewExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> NewExpression1HasCallInTailPosition0.func,
    "IsDestructuring0" -> NewExpression1IsDestructuring0.func,
    "IsFunctionDefinition0" -> NewExpression1IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> NewExpression1IsIdentifierRef0.func
  )
}
