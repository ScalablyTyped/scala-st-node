package org.scalablytyped.node.node.cryptoMod

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.anon.PlaintextLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherGCM extends Cipher {
  def getAuthTag(): Buffer = js.native
  def setAAD(buffer: Buffer): this.type = js.native
  def setAAD(buffer: Buffer, options: PlaintextLength): this.type = js.native
}

