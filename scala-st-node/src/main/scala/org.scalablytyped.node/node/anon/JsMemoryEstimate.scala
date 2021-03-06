package org.scalablytyped.node.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsMemoryEstimate extends js.Object {
  var jsMemoryEstimate: Double
  var jsMemoryRange: js.Tuple2[Double, Double]
}

object JsMemoryEstimate {
  @scala.inline
  def apply(jsMemoryEstimate: Double, jsMemoryRange: js.Tuple2[Double, Double]): JsMemoryEstimate = {
    val __obj = js.Dynamic.literal(jsMemoryEstimate = jsMemoryEstimate.asInstanceOf[js.Any], jsMemoryRange = jsMemoryRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsMemoryEstimate]
  }
  @scala.inline
  implicit class JsMemoryEstimateOps[Self <: JsMemoryEstimate] (val x: Self) extends AnyVal {
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
    def setJsMemoryEstimate(value: Double): Self = this.set("jsMemoryEstimate", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsMemoryRange(value: js.Tuple2[Double, Double]): Self = this.set("jsMemoryRange", value.asInstanceOf[js.Any])
  }
  
}

