package org.scalablytyped.node.node.cryptoMod

import org.scalablytyped.node.node.nodeStrings.der
import org.scalablytyped.node.node.nodeStrings.dsa
import org.scalablytyped.node.node.nodeStrings.ec
import org.scalablytyped.node.node.nodeStrings.ed25519
import org.scalablytyped.node.node.nodeStrings.pem
import org.scalablytyped.node.node.nodeStrings.rsa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync extends js.Object {
  def apply(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: ed25519, options: ED25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
}

