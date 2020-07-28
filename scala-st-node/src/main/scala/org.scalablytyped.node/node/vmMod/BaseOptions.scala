package org.scalablytyped.node.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * Specifies the column number offset that is displayed in stack traces produced by this script.
    * Default: `0`
    */
  var columnOffset: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the filename used in stack traces produced by this script.
    * Default: `''`.
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * Specifies the line number offset that is displayed in stack traces produced by this script.
    * Default: `0`.
    */
  var lineOffset: js.UndefOr[Double] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
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
    def setColumnOffset(value: Double): Self = this.set("columnOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnOffset: Self = this.set("columnOffset", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setLineOffset(value: Double): Self = this.set("lineOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineOffset: Self = this.set("lineOffset", js.undefined)
  }
  
}

