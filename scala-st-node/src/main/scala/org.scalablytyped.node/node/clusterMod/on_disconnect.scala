package org.scalablytyped.node.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "on")
@js.native
object on_disconnect extends js.Object {
  def apply(
    event: org.scalablytyped.node.node.nodeStrings.disconnect,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): Cluster = js.native
}

