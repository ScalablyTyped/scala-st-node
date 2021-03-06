package org.scalablytyped.node.node.anon

import org.scalablytyped.node.node.nodeStrings.buffer_
import org.scalablytyped.node.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.node.node.processMod.global.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  encoding :'buffer' | null} & node.child_process.ExecOptions */
trait encodingbuffernullExecOpt extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var encoding: buffer_ | Null
  var env: js.UndefOr[ProcessEnv] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  var maxBuffer: js.UndefOr[Double] = js.undefined
  var shell: js.UndefOr[String] = js.undefined
  /**
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
  /**
    * @default true
    */
  var windowsHide: js.UndefOr[Boolean] = js.undefined
}

object encodingbuffernullExecOpt {
  @scala.inline
  def apply(): encodingbuffernullExecOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[encodingbuffernullExecOpt]
  }
  @scala.inline
  implicit class encodingbuffernullExecOptOps[Self <: encodingbuffernullExecOpt] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setEncoding(value: buffer_): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setEnv(value: ProcessEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setKillSignal(value: Signals | Double): Self = this.set("killSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKillSignal: Self = this.set("killSignal", js.undefined)
    @scala.inline
    def setMaxBuffer(value: Double): Self = this.set("maxBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBuffer: Self = this.set("maxBuffer", js.undefined)
    @scala.inline
    def setShell(value: String): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setWindowsHide(value: Boolean): Self = this.set("windowsHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsHide: Self = this.set("windowsHide", js.undefined)
  }
  
}

