package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.spec._
import kr.ac.kaist.ires.util.Useful._

object TypeGenerator {
  def apply(packageName: String, modelDir: String, tname: String, methods: Map[String, String]): Unit = {
    val nf = getPrintWriter(s"$modelDir/type/$tname.scala")
    nf.println(s"""package $packageName.model""")
    nf.println(s"""""")
    nf.println(s"""import $packageName.core._""")
    nf.println(s"""object $tname {""")
    nf.println(s"""  val map: Map[Value, Value] = Map(""")
    nf.println(methods.map {
      case (key, value) =>
        s"""    (Str("$key") -> ${getScalaName(value)}.func)"""
    }.mkString("," + LINE_SEP))
    nf.println(s"""  )""")
    nf.println(s"""}""")
    nf.close()
  }
}
