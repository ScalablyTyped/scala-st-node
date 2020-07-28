package org.scalablytyped.node.node.http2Mod

import org.scalablytyped.node.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureClientSessionOptions
  extends ConnectionOptions
     with ClientSessionOptions

object SecureClientSessionOptions {
  @scala.inline
  def apply(): SecureClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureClientSessionOptions]
  }
}

