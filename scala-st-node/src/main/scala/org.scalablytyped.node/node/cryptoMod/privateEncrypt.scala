package org.scalablytyped.node.node.cryptoMod

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "privateEncrypt")
@js.native
object privateEncrypt extends js.Object {
  def apply(private_key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  def apply(private_key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
}

