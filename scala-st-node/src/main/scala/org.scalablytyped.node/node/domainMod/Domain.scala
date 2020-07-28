package org.scalablytyped.node.node.domainMod

import org.scalablytyped.node.node.NodeJS.Timer
import org.scalablytyped.node.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domain", "Domain")
@js.native
class Domain ()
  extends EventEmitter
     with org.scalablytyped.node.node.domainMod.global.NodeJS.Domain {
  var members: js.Array[EventEmitter | Timer] = js.native
  def enter(): Unit = js.native
  def exit(): Unit = js.native
}

