package org.scalablytyped.node.node.clusterMod

import org.scalablytyped.node.node.nodeStrings.udp4
import org.scalablytyped.node.node.nodeStrings.udp6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: String
  var addressType: Double | udp4 | udp6
  var port: Double
}

object Address {
  @scala.inline
  def apply(address: String, addressType: Double | udp4 | udp6, port: Double): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressType(value: Double | udp4 | udp6): Self = this.set("addressType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
  }
  
}

