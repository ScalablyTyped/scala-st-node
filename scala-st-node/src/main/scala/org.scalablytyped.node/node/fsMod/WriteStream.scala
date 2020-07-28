package org.scalablytyped.node.node.fsMod

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.nodeStrings.ready
import org.scalablytyped.node.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "WriteStream")
@js.native
class WriteStream () extends Writable {
  var bytesWritten: Double = js.native
  var path: String | Buffer = js.native
  var pending: Boolean = js.native
  @JSName("addListener")
  def addListener_open(event: org.scalablytyped.node.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  def close(): Unit = js.native
  @JSName("on")
  def on_open(event: org.scalablytyped.node.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_open(event: org.scalablytyped.node.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_open(event: org.scalablytyped.node.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_open(event: org.scalablytyped.node.node.nodeStrings.open, listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
}

