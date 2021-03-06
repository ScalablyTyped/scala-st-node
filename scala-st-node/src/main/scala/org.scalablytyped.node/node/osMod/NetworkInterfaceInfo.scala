package org.scalablytyped.node.node.osMod

import org.scalablytyped.node.node.nodeStrings.IPv4
import org.scalablytyped.node.node.nodeStrings.IPv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - `org.scalablytyped.node`.node.osMod.NetworkInterfaceInfoIPv4
  - `org.scalablytyped.node`.node.osMod.NetworkInterfaceInfoIPv6
*/
trait NetworkInterfaceInfo extends js.Object

object NetworkInterfaceInfo {
  @scala.inline
  def NetworkInterfaceInfoIPv4(address: String, family: IPv4, internal: Boolean, mac: String, netmask: String): NetworkInterfaceInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceInfo]
  }
  @scala.inline
  def NetworkInterfaceInfoIPv6(address: String, family: IPv6, internal: Boolean, mac: String, netmask: String, scopeid: Double): NetworkInterfaceInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], scopeid = scopeid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceInfo]
  }
}

