package org.scalablytyped.node.node.cryptoMod

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.BufferEncoding
import org.scalablytyped.node.node.NodeJS.ArrayBufferView
import org.scalablytyped.node.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Cipher")
@js.native
class Cipher protected () extends Transform {
  def `final`(): Buffer = js.native
  def `final`(output_encoding: BufferEncoding): String = js.native
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: Boolean): this.type = js.native
  def update(
    data: ArrayBufferView,
    input_encoding: js.UndefOr[scala.Nothing],
    output_encoding: HexBase64BinaryEncoding
  ): String = js.native
  def update(data: BinaryLike): Buffer = js.native
  def update(data: String, input_encoding: js.UndefOr[scala.Nothing], output_encoding: HexBase64BinaryEncoding): String = js.native
  def update(data: String, input_encoding: Utf8AsciiBinaryEncoding): Buffer = js.native
  def update(data: String, input_encoding: Utf8AsciiBinaryEncoding, output_encoding: HexBase64BinaryEncoding): String = js.native
}

