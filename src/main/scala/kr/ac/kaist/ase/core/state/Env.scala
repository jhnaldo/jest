package kr.ac.kaist.ase.core

// CORE Environments
case class Env(
  locals: Addr,
  retCont: Option[Cont] = None,
  excCont: Option[Cont] = None
) extends CoreNode