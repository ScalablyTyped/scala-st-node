package org.scalablytyped.node.node.vmMod

import org.scalablytyped.node.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptOptions extends BaseOptions {
  var cachedData: js.UndefOr[Buffer] = js.undefined
  var displayErrors: js.UndefOr[Boolean] = js.undefined
  var produceCachedData: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ScriptOptions {
  @scala.inline
  def apply(): ScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptOptions]
  }
  @scala.inline
  implicit class ScriptOptionsOps[Self <: ScriptOptions] (val x: Self) extends AnyVal {
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
    def setCachedData(value: Buffer): Self = this.set("cachedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachedData: Self = this.set("cachedData", js.undefined)
    @scala.inline
    def setDisplayErrors(value: Boolean): Self = this.set("displayErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayErrors: Self = this.set("displayErrors", js.undefined)
    @scala.inline
    def setProduceCachedData(value: Boolean): Self = this.set("produceCachedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduceCachedData: Self = this.set("produceCachedData", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

