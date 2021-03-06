package org.scalablytyped.node.node.cryptoMod

import org.scalablytyped.node.node.anon.Format
import org.scalablytyped.node.node.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ED25519KeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `1`
  var publicKeyEncoding: Format[PubF]
}

object ED25519KeyPairOptions {
  @scala.inline
  def apply[/* <: `org.scalablytyped.node`.node.cryptoMod.KeyFormat */ PubF, /* <: `org.scalablytyped.node`.node.cryptoMod.KeyFormat */ PrivF](privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `1`, publicKeyEncoding: Format[PubF]): ED25519KeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ED25519KeyPairOptions[PubF, PrivF]]
  }
  @scala.inline
  implicit class ED25519KeyPairOptionsOps[Self <: ED25519KeyPairOptions[_, _], /* <: `org.scalablytyped.node`.node.cryptoMod.KeyFormat */ PubF, /* <: `org.scalablytyped.node`.node.cryptoMod.KeyFormat */ PrivF] (val x: Self with (ED25519KeyPairOptions[PubF, PrivF])) extends AnyVal {
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
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with `1`): Self = this.set("privateKeyEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKeyEncoding(value: Format[PubF]): Self = this.set("publicKeyEncoding", value.asInstanceOf[js.Any])
  }
  
}

