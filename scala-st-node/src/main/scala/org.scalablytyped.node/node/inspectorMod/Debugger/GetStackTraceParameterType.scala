package org.scalablytyped.node.node.inspectorMod.Debugger

import org.scalablytyped.node.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStackTraceParameterType extends js.Object {
  var stackTraceId: StackTraceId
}

object GetStackTraceParameterType {
  @scala.inline
  def apply(stackTraceId: StackTraceId): GetStackTraceParameterType = {
    val __obj = js.Dynamic.literal(stackTraceId = stackTraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackTraceParameterType]
  }
  @scala.inline
  implicit class GetStackTraceParameterTypeOps[Self <: GetStackTraceParameterType] (val x: Self) extends AnyVal {
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
    def setStackTraceId(value: StackTraceId): Self = this.set("stackTraceId", value.asInstanceOf[js.Any])
  }
  
}

