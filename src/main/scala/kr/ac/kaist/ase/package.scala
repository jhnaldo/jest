package kr.ac.kaist

import java.io.File

package object ase {
  // Line seperator
  val LINE_SEP = System.getProperty("line.separator")

  // Base project directory root
  val BASE_DIR = System.getenv("ASE_HOME")

  // Tests directory root
  val TEST_DIR = s"${BASE_DIR}/tests"

  // Source directory root
  val SRC_DIR = s"${BASE_DIR}/src/main"

  // Resource directory root
  val RESOURCE_DIR = s"${SRC_DIR}/resources"

  // Scala source directory root
  val SCALA_DIR = s"${SRC_DIR}/scala/kr/ac/kaist/ase"

  // Model directory root
  val MODEL_DIR = s"${SCALA_DIR}/model"

  // Rule directory root
  val RULE_DIR = s"${SCALA_DIR}/algorithm/rule"

  // Current directory root
  val CUR_DIR = System.getProperty("user.dir")
}
