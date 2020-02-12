package kr.ac.kaist.ires.algorithm

import kr.ac.kaist.ires.LINE_SEP
import kr.ac.kaist.ires.parser
import kr.ac.kaist.ires.util.Useful.readFile
import spray.json._

// algorithms
case class Algorithm(
    length: Int,
    params: List[String],
    kind: AlgoKind,
    steps: List[Step],
    filename: String
) {
  def getSteps(init: List[Step]): List[Step] = steps.foldLeft(init) {
    case (list, step) => step.getSteps(list)
  }

  private def getInfo = {
    var k = 0
    def next: Next = { val res = Next(k); k += 1; res }
    def T(tokens: List[Token], token: Token): List[Token] = token match {
      case StepList(steps) => Out :: steps.foldLeft(In :: tokens)(S(_, _))
      case t => t :: tokens
    }
    def S(tokens: List[Token], step: Step): List[Token] =
      next :: step.tokens.foldLeft(tokens)(T(_, _))
    (steps.foldLeft(List[Token]())(S(_, _)).reverse, k)
  }
  def toTokenList = getInfo._1
  def lineCount = getInfo._2
}
object Algorithm extends DefaultJsonProtocol {
  implicit object TokenFormat extends RootJsonFormat[Token] {
    override def read(json: JsValue): Token = json match {
      case JsString(text) => Text(text)
      case v =>
        val discrimator = List(
          "const", "code", "value", "id",
          "steps", "nt", "sup", "url", "grammar"
        ).map(d => json.asJsObject.fields.contains(d))
        discrimator.indexOf(true) match {
          case 0 => ConstFormat.read(v)
          case 1 => CodeFormat.read(v)
          case 2 => ValueFormat.read(v)
          case 3 => IdFormat.read(v)
          case 4 => StepListFormat.read(v)
          case 5 => NtFormat.read(v)
          case 6 => SupFormat.read(v)
          case 7 => UrlFormat.read(v)
          case 8 => GrammarFormat.read(v)
          case _ => deserializationError(s"unknown Token: $v")
        }
    }
    override def write(token: Token): JsValue = token match {
      case (t: Const) => ConstFormat.write(t)
      case (t: Code) => CodeFormat.write(t)
      case (t: Value) => ValueFormat.write(t)
      case (t: Id) => IdFormat.write(t)
      case (t: StepList) => StepListFormat.write(t)
      case (t: Nt) => NtFormat.write(t)
      case (t: Sup) => SupFormat.write(t)
      case (t: Url) => UrlFormat.write(t)
      case (t: Grammar) => GrammarFormat.write(t)
      case Text(text) => JsString(text)
    }
  }
  implicit object AlgoKindFormat extends RootJsonFormat[AlgoKind] {
    override def read(json: JsValue): AlgoKind = json match {
      case JsString("RuntimeSemantics") => RuntimeSemantics
      case JsString("StaticSemantics") => StaticSemantics
      case JsString("Method") => Method
      case JsString("Language") => Language
      case JsString("Builtin") => Builtin
      case v => deserializationError(s"unknown AlgoKind: $v")
    }
    override def write(kind: AlgoKind): JsValue = kind match {
      case RuntimeSemantics => JsString("RuntimeSemantics")
      case StaticSemantics => JsString("StaticSemantics")
      case Method => JsString("Method")
      case Language => JsString("Language")
      case Builtin => JsString("Builtin")
    }
  }
  implicit lazy val StepFormat = jsonFormat1(Step)
  implicit lazy val ConstFormat = jsonFormat1(Const)
  implicit lazy val CodeFormat = jsonFormat1(Code)
  implicit lazy val ValueFormat = jsonFormat1(Value)
  implicit lazy val IdFormat = jsonFormat1(Id)
  implicit lazy val StepListFormat = jsonFormat1(StepList)
  implicit lazy val NtFormat = jsonFormat1(Nt)
  implicit lazy val SupFormat = jsonFormat1(Sup)
  implicit lazy val UrlFormat = jsonFormat1(Url)
  implicit lazy val GrammarFormat = jsonFormat2(Grammar)
  implicit lazy val AlgorithmFormat = jsonFormat5(Algorithm.apply)

  def apply(filename: String): Algorithm = {
    readFile(filename).parseJson.convertTo[Algorithm]
  }
}
