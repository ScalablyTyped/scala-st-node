package org.scalablytyped.node.node.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions extends js.Object {
  /**
    * Keep sockets around in a pool to be used by other requests in the future. Default = false
    */
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  /**
    * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
    * Only relevant if keepAlive is set to true.
    */
  var keepAliveMsecs: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
    */
  var maxFreeSockets: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
    */
  var maxSockets: js.UndefOr[Double] = js.undefined
  /**
    * Socket timeout in milliseconds. This will set the timeout after the socket is connected.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object AgentOptions {
  @scala.inline
  def apply(): AgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentOptions]
  }
  @scala.inline
  implicit class AgentOptionsOps[Self <: AgentOptions] (val x: Self) extends AnyVal {
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
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setKeepAliveMsecs(value: Double): Self = this.set("keepAliveMsecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAliveMsecs: Self = this.set("keepAliveMsecs", js.undefined)
    @scala.inline
    def setMaxFreeSockets(value: Double): Self = this.set("maxFreeSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFreeSockets: Self = this.set("maxFreeSockets", js.undefined)
    @scala.inline
    def setMaxSockets(value: Double): Self = this.set("maxSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSockets: Self = this.set("maxSockets", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

