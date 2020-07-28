package org.scalablytyped.node.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptSourceReturnType extends js.Object {
  /**
    * Script source.
    */
  var scriptSource: String
}

object GetScriptSourceReturnType {
  @scala.inline
  def apply(scriptSource: String): GetScriptSourceReturnType = {
    val __obj = js.Dynamic.literal(scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptSourceReturnType]
  }
  @scala.inline
  implicit class GetScriptSourceReturnTypeOps[Self <: GetScriptSourceReturnType] (val x: Self) extends AnyVal {
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
    def setScriptSource(value: String): Self = this.set("scriptSource", value.asInstanceOf[js.Any])
  }
  
}

