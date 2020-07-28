package org.scalablytyped.node.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesWritten[TBuffer /* <: js.typedarray.Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesWritten: Double
}

object BytesWritten {
  @scala.inline
  def apply[/* <: `org.scalablytyped.node`.std.Uint8Array */ TBuffer](buffer: TBuffer, bytesWritten: Double): BytesWritten[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWritten[TBuffer]]
  }
  @scala.inline
  implicit class BytesWrittenOps[Self <: BytesWritten[_], /* <: `org.scalablytyped.node`.std.Uint8Array */ TBuffer] (val x: Self with BytesWritten[TBuffer]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffer(value: TBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesWritten(value: Double): Self = this.set("bytesWritten", value.asInstanceOf[js.Any])
  }
  
}

