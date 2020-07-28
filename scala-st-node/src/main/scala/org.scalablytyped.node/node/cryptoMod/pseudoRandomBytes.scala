package org.scalablytyped.node.node.cryptoMod

import org.scalablytyped.node.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "pseudoRandomBytes")
@js.native
object pseudoRandomBytes extends js.Object {
  def apply(size: Double): Buffer = js.native
  def apply(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
}

