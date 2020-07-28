package org.scalablytyped.node.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debug extends js.Object {
  var debug: Boolean
  var inspector: Boolean
  var ipv6: Boolean
  var tls: Boolean
  var tls_alpn: Boolean
  var tls_ocsp: Boolean
  var tls_sni: Boolean
  var uv: Boolean
}

object Debug {
  @scala.inline
  def apply(
    debug: Boolean,
    inspector: Boolean,
    ipv6: Boolean,
    tls: Boolean,
    tls_alpn: Boolean,
    tls_ocsp: Boolean,
    tls_sni: Boolean,
    uv: Boolean
  ): Debug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], inspector = inspector.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any], tls_alpn = tls_alpn.asInstanceOf[js.Any], tls_ocsp = tls_ocsp.asInstanceOf[js.Any], tls_sni = tls_sni.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debug]
  }
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspector(value: Boolean): Self = this.set("inspector", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpv6(value: Boolean): Self = this.set("ipv6", value.asInstanceOf[js.Any])
    @scala.inline
    def setTls(value: Boolean): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def setTls_alpn(value: Boolean): Self = this.set("tls_alpn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTls_ocsp(value: Boolean): Self = this.set("tls_ocsp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTls_sni(value: Boolean): Self = this.set("tls_sni", value.asInstanceOf[js.Any])
    @scala.inline
    def setUv(value: Boolean): Self = this.set("uv", value.asInstanceOf[js.Any])
  }
  
}

