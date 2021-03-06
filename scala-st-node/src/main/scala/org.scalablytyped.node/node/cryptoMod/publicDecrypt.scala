package org.scalablytyped.node.node.cryptoMod

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "publicDecrypt")
@js.native
object publicDecrypt extends js.Object {
  def apply(key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  def apply(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
  def apply(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = js.native
}

