package org.scalablytyped.node.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyPublicKey extends js.Object {
  var privateKey: String
  var publicKey: org.scalablytyped.node.node.Buffer
}

object PrivateKeyPublicKey {
  @scala.inline
  def apply(privateKey: String, publicKey: org.scalablytyped.node.node.Buffer): PrivateKeyPublicKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyPublicKey]
  }
  @scala.inline
  implicit class PrivateKeyPublicKeyOps[Self <: PrivateKeyPublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: org.scalablytyped.node.node.Buffer): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
  
}

