package org.scalablytyped.node.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stdout extends js.Object {
  var stderr: org.scalablytyped.node.node.Buffer
  var stdout: org.scalablytyped.node.node.Buffer
}

object Stdout {
  @scala.inline
  def apply(stderr: org.scalablytyped.node.node.Buffer, stdout: org.scalablytyped.node.node.Buffer): Stdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdout]
  }
  @scala.inline
  implicit class StdoutOps[Self <: Stdout] (val x: Self) extends AnyVal {
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
    def setStderr(value: org.scalablytyped.node.node.Buffer): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdout(value: org.scalablytyped.node.node.Buffer): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
  
}

