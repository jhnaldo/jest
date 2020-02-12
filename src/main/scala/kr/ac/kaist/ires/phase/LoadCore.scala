package kr.ac.kaist.ires.phase

import scala.util.{ Try, Success }
import kr.ac.kaist.ires.IRESConfig
import kr.ac.kaist.ires.core._
import kr.ac.kaist.ires.model.Model
import kr.ac.kaist.ires.util._

// LoadCore phase
case object LoadCore extends PhaseObj[Program, LoadCoreConfig, State] {
  val name: String = "load-core"
  val help: String = "Load Core program into Core State"

  def apply(
    pgm: Program,
    iresConfig: IRESConfig,
    config: LoadCoreConfig
  ): State = Model.initState.copy(context = Model.initState.context.copy(insts = pgm.insts))

  def defaultConfig: LoadCoreConfig = LoadCoreConfig()
  val options: List[PhaseOption[LoadCoreConfig]] = List()
}

// LoadCore phase config
case class LoadCoreConfig() extends Config
