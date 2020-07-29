package kr.ac.kaist.ires.util

import java.io.{ Reader, File, PrintWriter }
import java.nio.file.{ Files, StandardCopyOption }
import kr.ac.kaist.ires.error.NoFileError
import kr.ac.kaist.ires.{ LINE_SEP, IRESConfig }
import scala.Console.{ RESET, RED, YELLOW, GREEN, CYAN }
import scala.collection.mutable
import scala.io.Source
import scala.util.Random
import spray.json._

object Useful {
  // file reader
  def fileReader(filename: String): Reader =
    Source.fromFile(filename, "UTF-8").bufferedReader

  // indentation
  def indentation(s: StringBuilder, str: String, indent: Int): Unit = {
    str.split(LINE_SEP) match {
      case Array(str, rest @ _*) => {
        s.append(str)
        rest.foreach(rStr => {
          s.append(LINE_SEP)
          for (i <- 0 until indent) { s.append(" ") }
          s.append(rStr)
        })
      }
      case _ =>
    }
  }

  // walk directory
  def walkTree(filename: String): Iterable[File] = walkTree(new File(filename))
  def walkTree(file: File): Iterable[File] = {
    val children = new Iterable[File] {
      def iterator: Iterator[File] =
        if (file.isDirectory) file.listFiles.iterator
        else Iterator.empty
    }
    Seq(file) ++ children.flatMap(walkTree(_))
  }

  // extention filter
  def extFilter(ext: String): String => Boolean = _.endsWith(s".$ext")
  lazy val irFilter = extFilter("ir")
  lazy val jsFilter = extFilter("js")
  lazy val jsonFilter = extFilter("json")
  lazy val scalaFilter = extFilter("scala")

  // file writer
  def getPrintWriter(filename: String): PrintWriter =
    new PrintWriter(new File(filename))

  // dump given data to a file
  def dumpFile(data: Any, filename: String): Unit = {
    val nf = getPrintWriter(filename)
    nf.print(data)
    nf.close()
  }

  // dump given data as JSON
  def dumpJson[T](data: T, filename: String)(implicit writer: JsonWriter[T]): Unit =
    dumpFile(data.toJson.prettyPrint, filename)

  // read file
  def readFile(filename: String): String =
    Source.fromFile(filename, "UTF-8").mkString

  // read JSON
  def readJson[T](filename: String)(implicit reader: JsonReader[T]): T =
    readFile(filename).parseJson.convertTo[T]

  // get first filename
  def getFirstFilename(iresConfig: IRESConfig, job: String): String =
    iresConfig.fileNames.headOption.getOrElse(throw NoFileError(job))

  // get simple file name
  def getSimpleFilename(filename: String): String = new File(filename).getName

  // delete files
  def deleteFile(filename: String): Unit = new File(filename).delete

  // change extension
  def changeExt(from: String, to: String): String => String =
    filename => filename.substring(0, filename.length - from.length) + to

  // get name without extension
  def removedExt(filename: String): String =
    filename.split('.').dropRight(1).mkString(".")

  // get extension
  def getExt(filename: String): String =
    filename.split('.').last

  // renamed filename
  def renameFile(from: String, to: String): Unit =
    new File(from).renameTo(new File(to))

  // copy file
  def copyFile(from: String, to: String): Unit = Files.copy(
    new File(from).toPath,
    new File(to).toPath,
    StandardCopyOption.REPLACE_EXISTING
  )

  // create directories
  def mkdir(name: String): Unit = new File(name).mkdirs

  // colored println
  def decorateColor(color: String): Any => String =
    x => color + x.toString + scala.Console.RESET
  def decorateRed: Any => String = decorateColor(RED)
  def decorateYellow: Any => String = decorateColor(YELLOW)
  def decorateGreen: Any => String = decorateColor(GREEN)
  def decorateCyan: Any => String = decorateColor(CYAN)
  def printColor(color: String): Any => Unit =
    x => print(decorateColor(color)(x))
  def printRed: Any => Unit = printColor(RED)
  def printYellow: Any => Unit = printColor(YELLOW)
  def printGreen: Any => Unit = printColor(GREEN)
  def printCyan: Any => Unit = printColor(CYAN)
  def printlnColor(color: String): Any => Unit =
    x => println(decorateColor(color)(x))
  def printlnRed: Any => Unit = printlnColor(RED)
  def printlnYellow: Any => Unit = printlnColor(YELLOW)
  def printlnGreen: Any => Unit = printlnColor(GREEN)
  def printlnCyan: Any => Unit = printlnColor(CYAN)

  // get name that could be used in Scala identifiers
  private val symbolRegex = "@@([^@]+)".r
  private val intrinsicRegex = "%([^%]+)%".r
  def getScalaName(str: String): String =
    str.replaceAll("\\.", "DOT") match {
      case intrinsicRegex(x) => "INTRINSIC_" + x
      case symbolRegex(x) => "SYMBOL_" + x
      case x => x
    }

  // cache for function
  def cached[A, B](f: A => B): A => B = {
    val cache = mutable.Map.empty[A, B]
    arg => cache.getOrElse(arg, {
      val res = f(arg)
      cache.update(arg, res)
      res
    })
  }

  // get percent string
  def getPercent[T](passSet: Iterable[T], totalSet: Iterable[T]): String = {
    val total = totalSet.size
    val pass = passSet.size
    val ratio = pass.toDouble / total * 100
    f"$pass / $total ($ratio%.2f%%)"
  }

  // existence check for files
  def exists(filename: String): Boolean = new File(filename).exists

  // randomly choose an element in a list
  val rand = new Random
  def choose[T](seq: Seq[T]): T = seq(rand.nextInt(seq.length))
  def randBool: Boolean = rand.nextBoolean
}
