package org.scalablytyped.node.node.clusterMod

import org.scalablytyped.node.node.NodeJS.Dict
import org.scalablytyped.node.node.eventsMod.EventEmitter
import org.scalablytyped.node.node.netMod.Server
import org.scalablytyped.node.node.netMod.Socket
import org.scalablytyped.node.node.nodeStrings.exit
import org.scalablytyped.node.node.nodeStrings.listening
import org.scalablytyped.node.node.nodeStrings.message
import org.scalablytyped.node.node.nodeStrings.online
import org.scalablytyped.node.node.nodeStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends EventEmitter {
  val SCHED_NONE: Double = js.native
  val SCHED_RR: Double = js.native
  var Worker: Worker_ = js.native
  var isMaster: Boolean = js.native
  var isWorker: Boolean = js.native
  var schedulingPolicy: Double = js.native
  var settings: ClusterSettings = js.native
  var worker: js.UndefOr[Worker_] = js.native
  var workers: js.UndefOr[Dict[Worker_]] = js.native
  @JSName("addListener")
  def addListener_disconnect(
    event: org.scalablytyped.node.node.nodeStrings.disconnect,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_fork(
    event: org.scalablytyped.node.node.nodeStrings.fork,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("addListener")
  def addListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
  def disconnect(): Unit = js.native
  def disconnect(callback: js.Function0[Unit]): Unit = js.native
  @JSName("emit")
  def emit_disconnect(event: org.scalablytyped.node.node.nodeStrings.disconnect, worker: Worker_): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, worker: Worker_, code: Double, signal: String): Boolean = js.native
  @JSName("emit")
  def emit_fork(event: org.scalablytyped.node.node.nodeStrings.fork, worker: Worker_): Boolean = js.native
  @JSName("emit")
  def emit_listening(event: listening, worker: Worker_, address: Address): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, worker: Worker_, message: js.Any, handle: Server): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, worker: Worker_, message: js.Any, handle: Socket): Boolean = js.native
  @JSName("emit")
  def emit_online(event: online, worker: Worker_): Boolean = js.native
  @JSName("emit")
  def emit_setup(event: setup, settings: ClusterSettings): Boolean = js.native
  def fork(): Worker_ = js.native
  def fork(env: js.Any): Worker_ = js.native
  @JSName("on")
  def on_disconnect(
    event: org.scalablytyped.node.node.nodeStrings.disconnect,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fork(
    event: org.scalablytyped.node.node.nodeStrings.fork,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("on")
  def on_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
  @JSName("on")
  def on_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
  @JSName("once")
  def once_disconnect(
    event: org.scalablytyped.node.node.nodeStrings.disconnect,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_fork(
    event: org.scalablytyped.node.node.nodeStrings.fork,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
  @JSName("once")
  def once_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("once")
  def once_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
  @JSName("once")
  def once_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(
    event: org.scalablytyped.node.node.nodeStrings.disconnect,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ String, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_fork(
    event: org.scalablytyped.node.node.nodeStrings.fork,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependListener")
  def prependListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(
    event: org.scalablytyped.node.node.nodeStrings.disconnect,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ String, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fork(
    event: org.scalablytyped.node.node.nodeStrings.fork,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
  def setupMaster(): Unit = js.native
  def setupMaster(settings: ClusterSettings): Unit = js.native
}

