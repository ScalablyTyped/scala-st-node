package org.scalablytyped.node.node.clusterMod

import org.scalablytyped.node.node.childProcessMod.ChildProcess
import org.scalablytyped.node.node.childProcessMod.SendHandle
import org.scalablytyped.node.node.childProcessMod.Serializable
import org.scalablytyped.node.node.eventsMod.EventEmitter
import org.scalablytyped.node.node.netMod.Server
import org.scalablytyped.node.node.netMod.Socket
import org.scalablytyped.node.node.nodeStrings.error
import org.scalablytyped.node.node.nodeStrings.exit
import org.scalablytyped.node.node.nodeStrings.listening
import org.scalablytyped.node.node.nodeStrings.message
import org.scalablytyped.node.node.nodeStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "Worker")
@js.native
class Worker_ () extends EventEmitter {
  var exitedAfterDisconnect: Boolean = js.native
  var id: Double = js.native
  var process: ChildProcess = js.native
  @JSName("addListener")
  def addListener_disconnect(event: org.scalablytyped.node.node.nodeStrings.disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("addListener")
  def addListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  def destroy(): Unit = js.native
  def destroy(signal: String): Unit = js.native
  def disconnect(): Unit = js.native
  @JSName("emit")
  def emit_disconnect(event: org.scalablytyped.node.node.nodeStrings.disconnect): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, error: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Double, signal: String): Boolean = js.native
  @JSName("emit")
  def emit_listening(event: listening, address: Address): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, message: js.Any, handle: Server): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, message: js.Any, handle: Socket): Boolean = js.native
  @JSName("emit")
  def emit_online(event: online): Boolean = js.native
  def isConnected(): Boolean = js.native
  def isDead(): Boolean = js.native
  def kill(): Unit = js.native
  def kill(signal: String): Unit = js.native
  @JSName("on")
  def on_disconnect(event: org.scalablytyped.node.node.nodeStrings.disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("on")
  def on_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_disconnect(event: org.scalablytyped.node.node.nodeStrings.disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("once")
  def once_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: org.scalablytyped.node.node.nodeStrings.disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ String, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependListener")
  def prependListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: org.scalablytyped.node.node.nodeStrings.disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ String, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  def send(message: Serializable): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  def send(message: Serializable, sendHandle: SendHandle): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: SendHandle,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
}

