package org.scalablytyped.node.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - `org.scalablytyped.node`.node.netMod.TcpNetConnectOpts
  - `org.scalablytyped.node`.node.netMod.IpcNetConnectOpts
*/
trait NetConnectOpts extends js.Object

object NetConnectOpts {
  @scala.inline
  def TcpNetConnectOpts(port: Double): NetConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetConnectOpts]
  }
  @scala.inline
  def IpcNetConnectOpts(path: String): NetConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetConnectOpts]
  }
}

