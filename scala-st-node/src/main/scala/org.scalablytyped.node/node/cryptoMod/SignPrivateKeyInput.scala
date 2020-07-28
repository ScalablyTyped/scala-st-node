package org.scalablytyped.node.node.cryptoMod

import org.scalablytyped.node.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignPrivateKeyInput
  extends PrivateKeyInput
     with SigningOptions

object SignPrivateKeyInput {
  @scala.inline
  def apply(key: String | Buffer): SignPrivateKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignPrivateKeyInput]
  }
}

