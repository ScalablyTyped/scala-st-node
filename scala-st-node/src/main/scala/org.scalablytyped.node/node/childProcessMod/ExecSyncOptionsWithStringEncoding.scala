package org.scalablytyped.node.node.childProcessMod

import org.scalablytyped.node.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecSyncOptionsWithStringEncoding extends ExecSyncOptions {
  @JSName("encoding")
  var encoding_ExecSyncOptionsWithStringEncoding: BufferEncoding
}

object ExecSyncOptionsWithStringEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding): ExecSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecSyncOptionsWithStringEncoding]
  }
  @scala.inline
  implicit class ExecSyncOptionsWithStringEncodingOps[Self <: ExecSyncOptionsWithStringEncoding] (val x: Self) extends AnyVal {
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
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
  }
  
}

