package org.scalablytyped.node.node.tlsMod

import org.scalablytyped.node.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyObject extends js.Object {
  /**
    * Optional passphrase.
    */
  var passphrase: js.UndefOr[String] = js.undefined
  /**
    * Private keys in PEM format.
    */
  var pem: String | Buffer
}

object KeyObject {
  @scala.inline
  def apply(pem: String | Buffer): KeyObject = {
    val __obj = js.Dynamic.literal(pem = pem.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyObject]
  }
  @scala.inline
  implicit class KeyObjectOps[Self <: KeyObject] (val x: Self) extends AnyVal {
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
    def setPem(value: String | Buffer): Self = this.set("pem", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
  }
  
}

