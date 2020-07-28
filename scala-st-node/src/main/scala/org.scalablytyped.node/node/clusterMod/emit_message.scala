package org.scalablytyped.node.node.clusterMod

import org.scalablytyped.node.node.netMod.Server
import org.scalablytyped.node.node.netMod.Socket
import org.scalablytyped.node.node.nodeStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "emit")
@js.native
object emit_message extends js.Object {
  def apply(event: message, worker: Worker_, message: js.Any, handle: Server): Boolean = js.native
  def apply(event: message, worker: Worker_, message: js.Any, handle: Socket): Boolean = js.native
}

