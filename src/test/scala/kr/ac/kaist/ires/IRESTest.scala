package kr.ac.kaist.ires

import java.io._
import kr.ac.kaist.ires.error.NotSupported
import kr.ac.kaist.ires.phase._
import kr.ac.kaist.ires.util.Useful._
import org.scalatest._
import scala.Console.{ CYAN, GREEN, RED }
import scala.io.Source
import scala.util.{ Try, Success, Failure }
import spray.json._

abstract class IRESTest extends FunSuite with BeforeAndAfterAll {
  // IRES configuration
  lazy val aseConfig: IRESConfig = IRESConfig(CmdBase, Nil, true)

  // results
  trait Result
  case object Pass extends Result
  case class Yet(msg: String) extends Result
  case object Fail extends Result
  protected var resMap: Map[String, Map[String, Result]] = Map()
  implicit object ResultFormat extends RootJsonFormat[Result] {
    override def read(json: JsValue): Result = json match {
      case JsString(text) => Yet(text)
      case JsBoolean(bool) => if (bool) Pass else Fail
      case v => deserializationError(s"unknown Result: $v")
    }

    override def write(result: Result): JsValue = result match {
      case Pass => JsTrue
      case Fail => JsFalse
      case Yet(msg) => JsString(msg)
    }
  }

  // count tests
  protected var count: Int = 0

  // check result
  def check[T](tag: String, name: String, t: => T): Unit = {
    count += 1
    test(s"[$tag] $name") {
      val res = resMap.getOrElse(tag, Map())
      (Try(t) match {
        case Success(_) =>
          resMap += tag -> (res + (name -> Pass))
          if (DISPLAY_TEST_PROGRESS) printGreen("#")
        case Failure(e @ NotSupported(msg)) =>
          resMap += tag -> (res + (name -> Yet(msg)))
          if (DISPLAY_TEST_PROGRESS) printYellow("#")
        case Failure(e) =>
          resMap += tag -> (res + (name -> Fail))
          if (DISPLAY_TEST_PROGRESS) printRed("#")
          fail(e.toString)
      })
    }
  }

  // get sir
  def getSir(res: Map[String, Result]): (Int, Int) = (
    res.count { case (k, r) => r == Pass },
    res.size
  )

  // tag name
  val tag: String

  // sort by keys
  def sortByKey[U, V](map: Map[U, V])(implicit ord: scala.math.Ordering[U]): List[(U, V)] = map.toList.sortBy { case (k, v) => k }

  // check backward-compatibility after all tests
  override def afterAll(): Unit = {
    import DefaultJsonProtocol._
    val sorted =
      resMap
        .toList
        .sortBy { case (k, v) => k }
        .map { case (t, r) => (t, getSir(r)) }

    // check backward-compatibility
    var breakCount = 0
    def error(msg: String): Unit = {
      breakCount += 1
      scala.Console.err.println(s"[Backward-Compatibility] $msg")
    }

    // show abstract result
    if (DISPLAY_TEST_PROGRESS) println
    print("[info] ")
    printlnColor(CYAN)(s"$tag:")
    sorted.foreach {
      case (t, (x, y)) =>
        print("[info] ")
        printlnColor(if (x == y) GREEN else RED)(s"  $t: $x / $y")
    }
    val filename = s"$TEST_DIR/result/$tag.json"
    val orig =
      Try(readFile(filename))
        .getOrElse("{}")
        .parseJson
        .convertTo[Map[String, Map[String, Result]]]
        .toSeq.sortBy(_._1)
    orig.foreach {
      case (name, origM) => resMap.get(name) match {
        case Some(curM) => origM.toSeq.sortBy(_._1) foreach {
          case (k, r) => (curM.get(k), r) match {
            case (None, _) => error(s"'[$name] $k' test is removed")
            case (Some(Fail), Yet(_) | Pass) => error(s"'[$name] $k' test becomes failed")
            case _ =>
          }
        }
        case None => error(s"'$name' tests are removed")
      }
    }

    // save abstract result if backward-compatible
    if (breakCount == 0) {
      val pw = getPrintWriter(s"$TEST_DIR/result/$tag")
      sorted.foreach { case (t, (x, y)) => pw.println(s"$t: $x / $y") }
      pw.close()

      val jpw = getPrintWriter(filename)
      jpw.println(resMap.toJson.sortedPrint)
      jpw.close()
    }
  }
}
