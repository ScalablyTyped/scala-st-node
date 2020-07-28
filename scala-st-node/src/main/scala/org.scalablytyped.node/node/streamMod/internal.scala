package org.scalablytyped.node.node.streamMod

import org.scalablytyped.node.node.NodeJS.WritableStream
import org.scalablytyped.node.node.anon.End
import org.scalablytyped.node.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait internal extends EventEmitter {
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}

