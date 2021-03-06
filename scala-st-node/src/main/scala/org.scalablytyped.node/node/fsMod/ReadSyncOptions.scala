package org.scalablytyped.node.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadSyncOptions extends js.Object {
  /**
    * @default `length of buffer`
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * @default 0
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * @default null
    */
  var position: js.UndefOr[Double | Null] = js.undefined
}

object ReadSyncOptions {
  @scala.inline
  def apply(): ReadSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadSyncOptions]
  }
  @scala.inline
  implicit class ReadSyncOptionsOps[Self <: ReadSyncOptions] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
  }
  
}

