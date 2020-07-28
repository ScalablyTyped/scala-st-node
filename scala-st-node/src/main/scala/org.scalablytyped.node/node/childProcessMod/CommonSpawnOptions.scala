package org.scalablytyped.node.node.childProcessMod

import org.scalablytyped.node.node.nodeStrings.ignore
import org.scalablytyped.node.node.nodeStrings.inherit
import org.scalablytyped.node.node.nodeStrings.ipc
import org.scalablytyped.node.node.nodeStrings.pipe
import org.scalablytyped.node.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSpawnOptions
  extends CommonOptions
     with MessagingOptions {
  var argv0: js.UndefOr[String] = js.undefined
  var shell: js.UndefOr[Boolean | String] = js.undefined
  var stdio: js.UndefOr[StdioOptions] = js.undefined
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}

object CommonSpawnOptions {
  @scala.inline
  def apply(): CommonSpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSpawnOptions]
  }
  @scala.inline
  implicit class CommonSpawnOptionsOps[Self <: CommonSpawnOptions] (val x: Self) extends AnyVal {
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
    def setArgv0(value: String): Self = this.set("argv0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgv0: Self = this.set("argv0", js.undefined)
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
    @scala.inline
    def setWindowsVerbatimArguments(value: Boolean): Self = this.set("windowsVerbatimArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsVerbatimArguments: Self = this.set("windowsVerbatimArguments", js.undefined)
  }
  
}

