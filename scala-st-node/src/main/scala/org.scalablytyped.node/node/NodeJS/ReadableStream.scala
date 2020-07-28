package org.scalablytyped.node.node.NodeJS

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.BufferEncoding
import org.scalablytyped.node.node.anon.End
import org.scalablytyped.node.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStream extends EventEmitter {
  var readable: Boolean = js.native
  def isPaused(): Boolean = js.native
  def pause(): this.type = js.native
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  def read(): String | Buffer = js.native
  def read(size: Double): String | Buffer = js.native
  def resume(): this.type = js.native
  def setEncoding(encoding: BufferEncoding): this.type = js.native
  def unpipe(): this.type = js.native
  def unpipe(destination: WritableStream): this.type = js.native
  def unshift(chunk: js.typedarray.Uint8Array): Unit = js.native
  def unshift(chunk: js.typedarray.Uint8Array, encoding: BufferEncoding): Unit = js.native
  def unshift(chunk: String): Unit = js.native
  def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
  def wrap(oldStream: ReadableStream): this.type = js.native
}

