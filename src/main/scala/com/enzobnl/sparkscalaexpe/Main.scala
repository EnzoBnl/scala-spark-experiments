package com.enzobnl.sparkscalaexpe

import com.enzobnl.sparkscalaexpe.playground._

object Main extends App {
  val runnables: Seq[Runnable] = Seq(Sb)
  for(torun <- runnables) torun.run
}
