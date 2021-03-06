package org.scalablytyped.node.node.dnsMod

import org.scalablytyped.node.node.nodeStrings.AAAA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyAaaaRecord
  extends RecordWithTtl
     with AnyRecord
     with AnyRecordWithTtl {
  var `type`: AAAA
}

object AnyAaaaRecord {
  @scala.inline
  def apply(address: String, ttl: Double, `type`: AAAA): AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyAaaaRecord]
  }
  @scala.inline
  implicit class AnyAaaaRecordOps[Self <: AnyAaaaRecord] (val x: Self) extends AnyVal {
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
    def setType(value: AAAA): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

