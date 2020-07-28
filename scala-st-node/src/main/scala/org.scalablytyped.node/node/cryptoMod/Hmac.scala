package org.scalablytyped.node.node.cryptoMod

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Hmac")
@js.native
class Hmac protected () extends Transform {
  def digest(): Buffer = js.native
  def digest(encoding: HexBase64Latin1Encoding): String = js.native
  def update(data: BinaryLike): Hmac = js.native
  def update(data: String, input_encoding: Utf8AsciiLatin1Encoding): Hmac = js.native
}

