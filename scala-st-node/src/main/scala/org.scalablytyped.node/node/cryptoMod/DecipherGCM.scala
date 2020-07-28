package org.scalablytyped.node.node.cryptoMod

import org.scalablytyped.node.node.NodeJS.ArrayBufferView
import org.scalablytyped.node.node.anon.PlaintextLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecipherGCM extends Decipher {
  def setAAD(buffer: ArrayBufferView): this.type = js.native
  def setAAD(buffer: ArrayBufferView, options: PlaintextLength): this.type = js.native
  def setAuthTag(buffer: ArrayBufferView): this.type = js.native
}

