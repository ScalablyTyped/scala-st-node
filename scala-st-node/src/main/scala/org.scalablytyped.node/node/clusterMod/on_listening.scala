package org.scalablytyped.node.node.clusterMod

import org.scalablytyped.node.node.nodeStrings.listening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "on")
@js.native
object on_listening extends js.Object {
  def apply(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = js.native
}

