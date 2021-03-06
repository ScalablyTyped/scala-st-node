package org.scalablytyped.node.node.childProcessMod

import org.scalablytyped.node.node.BufferEncoding
import org.scalablytyped.node.node.NodeJS.ArrayBufferView
import org.scalablytyped.node.node.nodeStrings.ignore
import org.scalablytyped.node.node.nodeStrings.inherit
import org.scalablytyped.node.node.nodeStrings.ipc
import org.scalablytyped.node.node.nodeStrings.pipe
import org.scalablytyped.node.node.processMod.global.NodeJS.Signals
import org.scalablytyped.node.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecFileSyncOptions extends CommonOptions {
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  var input: js.UndefOr[String | ArrayBufferView] = js.undefined
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  var maxBuffer: js.UndefOr[Double] = js.undefined
  var shell: js.UndefOr[Boolean | String] = js.undefined
  var stdio: js.UndefOr[StdioOptions] = js.undefined
}

object ExecFileSyncOptions {
  @scala.inline
  def apply(): ExecFileSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecFileSyncOptions]
  }
  @scala.inline
  implicit class ExecFileSyncOptionsOps[Self <: ExecFileSyncOptions] (val x: Self) extends AnyVal {
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
    def setInputUint16Array(value: js.typedarray.Uint16Array): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputUint32Array(value: js.typedarray.Uint32Array): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputUint8Array(value: js.typedarray.Uint8Array): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputInt16Array(value: js.typedarray.Int16Array): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputDataView(value: js.typedarray.DataView): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: String | ArrayBufferView): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputFloat32Array(value: js.typedarray.Float32Array): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputFloat64Array(value: js.typedarray.Float64Array): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputInt8Array(value: js.typedarray.Int8Array): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputInt32Array(value: js.typedarray.Int32Array): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setKillSignal(value: Signals | Double): Self = this.set("killSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKillSignal: Self = this.set("killSignal", js.undefined)
    @scala.inline
    def setMaxBuffer(value: Double): Self = this.set("maxBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBuffer: Self = this.set("maxBuffer", js.undefined)
    @scala.inline
    def setShell(value: Boolean | String): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    @scala.inline
    def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = this.set("stdio", js.Array(value :_*))
    @scala.inline
    def setStdio(value: StdioOptions): Self = this.set("stdio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
  }
  
}

