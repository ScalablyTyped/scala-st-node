package org.scalablytyped.node.node.netMod

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.BufferEncoding
import org.scalablytyped.node.node.NodeJS.WritableStream
import org.scalablytyped.node.node.anon.End
import org.scalablytyped.node.node.childProcessMod.SendHandle
import org.scalablytyped.node.node.nodeStrings.close
import org.scalablytyped.node.node.nodeStrings.data
import org.scalablytyped.node.node.nodeStrings.lookup
import org.scalablytyped.node.node.nodeStrings.timeout
import org.scalablytyped.node.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "Socket")
@js.native
class Socket ()
  extends Duplex
     with SendHandle {
  def this(options: SocketConstructorOpts) = this()
  val bufferSize: Double = js.native
  val bytesRead: Double = js.native
  val bytesWritten: Double = js.native
  val connecting: Boolean = js.native
  val localAddress: String = js.native
  val localPort: Double = js.native
  val remoteAddress: js.UndefOr[String] = js.native
  val remoteFamily: js.UndefOr[String] = js.native
  val remotePort: js.UndefOr[Double] = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connect(event: org.scalablytyped.node.node.nodeStrings.connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ js.Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  def address(): AddressInfo | String = js.native
  def connect(options: SocketConnectOpts): this.type = js.native
  def connect(options: SocketConnectOpts, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(path: String): this.type = js.native
  def connect(path: String, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(port: Double): this.type = js.native
  def connect(port: Double, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(port: Double, host: String): this.type = js.native
  def connect(port: Double, host: String, connectionListener: js.Function0[Unit]): this.type = js.native
  @JSName("emit")
  def emit_close(event: close, had_error: Boolean): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: org.scalablytyped.node.node.nodeStrings.connect): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, data: Buffer): Boolean = js.native
  @JSName("emit")
  def emit_lookup(event: lookup, err: js.Error, address: String, family: String, host: String): Boolean = js.native
  @JSName("emit")
  def emit_lookup(event: lookup, err: js.Error, address: String, family: Double, host: String): Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: timeout): Boolean = js.native
  def end(buffer: js.typedarray.Uint8Array): Unit = js.native
  def end(buffer: js.typedarray.Uint8Array, cb: js.Function0[Unit]): Unit = js.native
  def end(buffer: String): Unit = js.native
  def end(buffer: String, cb: js.Function0[Unit]): Unit = js.native
  def end(str: js.typedarray.Uint8Array, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def end(str: js.typedarray.Uint8Array, encoding: BufferEncoding): Unit = js.native
  def end(str: js.typedarray.Uint8Array, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
  def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def end(str: String, encoding: BufferEncoding): Unit = js.native
  def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: org.scalablytyped.node.node.nodeStrings.connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ js.Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("once")
  def once_connect(event: org.scalablytyped.node.node.nodeStrings.connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ js.Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(event: org.scalablytyped.node.node.nodeStrings.connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ js.Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(event: org.scalablytyped.node.node.nodeStrings.connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ js.Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  def ref(): this.type = js.native
  def setEncoding(): this.type = js.native
  def setKeepAlive(): this.type = js.native
  def setKeepAlive(enable: js.UndefOr[scala.Nothing], initialDelay: Double): this.type = js.native
  def setKeepAlive(enable: Boolean): this.type = js.native
  def setKeepAlive(enable: Boolean, initialDelay: Double): this.type = js.native
  def setNoDelay(): this.type = js.native
  def setNoDelay(noDelay: Boolean): this.type = js.native
  def setTimeout(timeout: Double): this.type = js.native
  def setTimeout(timeout: Double, callback: js.Function0[Unit]): this.type = js.native
  def unref(): this.type = js.native
  // Extended base methods
  def write(buffer: js.typedarray.Uint8Array): Boolean = js.native
  def write(buffer: js.typedarray.Uint8Array, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Boolean = js.native
  def write(buffer: String): Boolean = js.native
  def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Boolean = js.native
  def write(
    str: js.typedarray.Uint8Array,
    encoding: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Boolean = js.native
  def write(str: js.typedarray.Uint8Array, encoding: BufferEncoding): Boolean = js.native
  def write(
    str: js.typedarray.Uint8Array,
    encoding: BufferEncoding,
    cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Boolean = js.native
  def write(
    str: String,
    encoding: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Boolean = js.native
  def write(str: String, encoding: BufferEncoding): Boolean = js.native
  def write(str: String, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Boolean = js.native
}

