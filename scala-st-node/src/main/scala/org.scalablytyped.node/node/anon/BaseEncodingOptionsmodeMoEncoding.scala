package org.scalablytyped.node.node.anon

import org.scalablytyped.node.node.BufferEncoding
import org.scalablytyped.node.node.fsMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.fs.BaseEncodingOptions & {  mode :node.fs.Mode | undefined,   flag :string | undefined} */
trait BaseEncodingOptionsmodeMoEncoding extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
}

object BaseEncodingOptionsmodeMoEncoding {
  @scala.inline
  def apply(): BaseEncodingOptionsmodeMoEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEncodingOptionsmodeMoEncoding]
  }
  @scala.inline
  implicit class BaseEncodingOptionsmodeMoEncodingOps[Self <: BaseEncodingOptionsmodeMoEncoding] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

