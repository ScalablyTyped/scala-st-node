package org.scalablytyped.node.node.fsMod

import org.scalablytyped.node.node.NodeJS.ArrayBufferView
import org.scalablytyped.node.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readv")
@js.native
object readv extends js.Object {
  def apply(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffers: js.Array[ArrayBufferView]): js.Promise[ReadVResult] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): js.Promise[ReadVResult] = js.native
}

