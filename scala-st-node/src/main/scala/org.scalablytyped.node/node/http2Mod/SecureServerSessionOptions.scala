package org.scalablytyped.node.node.http2Mod

import org.scalablytyped.node.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureServerSessionOptions
  extends TlsOptions
     with ServerSessionOptions

object SecureServerSessionOptions {
  @scala.inline
  def apply(): SecureServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureServerSessionOptions]
  }
}

