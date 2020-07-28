package org.scalablytyped.node.node.anon

import org.scalablytyped.node.node.cryptoMod.KeyFormat
import org.scalablytyped.node.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatType[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF
  var `type`: spki
}

object FormatType {
  @scala.inline
  def apply[/* <: `org.scalablytyped.node`.node.cryptoMod.KeyFormat */ PubF](format: PubF, `type`: spki): FormatType[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatType[PubF]]
  }
  @scala.inline
  implicit class FormatTypeOps[Self <: FormatType[_], /* <: `org.scalablytyped.node`.node.cryptoMod.KeyFormat */ PubF] (val x: Self with FormatType[PubF]) extends AnyVal {
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
    def setFormat(value: PubF): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: spki): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

