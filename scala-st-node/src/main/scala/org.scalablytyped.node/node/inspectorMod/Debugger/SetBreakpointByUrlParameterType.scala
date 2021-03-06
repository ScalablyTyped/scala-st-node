package org.scalablytyped.node.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointByUrlParameterType extends js.Object {
  /**
    * Offset in the line to set breakpoint at.
    */
  var columnNumber: js.UndefOr[Double] = js.undefined
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[String] = js.undefined
  /**
    * Line number to set breakpoint at.
    */
  var lineNumber: Double
  /**
    * Script hash of the resources to set breakpoint on.
    */
  var scriptHash: js.UndefOr[String] = js.undefined
  /**
    * URL of the resources to set breakpoint on.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Regex pattern for the URLs of the resources to set breakpoints on. Either <code>url</code> or <code>urlRegex</code> must be specified.
    */
  var urlRegex: js.UndefOr[String] = js.undefined
}

object SetBreakpointByUrlParameterType {
  @scala.inline
  def apply(lineNumber: Double): SetBreakpointByUrlParameterType = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointByUrlParameterType]
  }
  @scala.inline
  implicit class SetBreakpointByUrlParameterTypeOps[Self <: SetBreakpointByUrlParameterType] (val x: Self) extends AnyVal {
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
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setScriptHash(value: String): Self = this.set("scriptHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptHash: Self = this.set("scriptHash", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlRegex(value: String): Self = this.set("urlRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlRegex: Self = this.set("urlRegex", js.undefined)
  }
  
}

