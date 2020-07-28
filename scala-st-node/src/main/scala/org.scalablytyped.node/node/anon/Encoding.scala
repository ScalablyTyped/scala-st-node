package org.scalablytyped.node.node.anon

import org.scalablytyped.node.node.nodeBooleans.`false`
import org.scalablytyped.node.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var encoding: buffer_
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(encoding: buffer_): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
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
    def setEncoding(value: buffer_): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithFileTypes(value: `false`): Self = this.set("withFileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithFileTypes: Self = this.set("withFileTypes", js.undefined)
  }
  
}

