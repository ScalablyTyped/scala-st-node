package org.scalablytyped.node.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StderrStdout extends js.Object {
  var stderr: String | org.scalablytyped.node.node.Buffer
  var stdout: String | org.scalablytyped.node.node.Buffer
}

object StderrStdout {
  @scala.inline
  def apply(
    stderr: String | org.scalablytyped.node.node.Buffer,
    stdout: String | org.scalablytyped.node.node.Buffer
  ): StderrStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StderrStdout]
  }
  @scala.inline
  implicit class StderrStdoutOps[Self <: StderrStdout] (val x: Self) extends AnyVal {
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
    def setStderr(value: String | org.scalablytyped.node.node.Buffer): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdout(value: String | org.scalablytyped.node.node.Buffer): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
  
}

