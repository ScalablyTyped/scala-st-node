package org.scalablytyped.node.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefCounted extends js.Object {
  def ref(): this.type
  def unref(): this.type
}

object RefCounted {
  @scala.inline
  def apply(ref: () => RefCounted, unref: () => RefCounted): RefCounted = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
    __obj.asInstanceOf[RefCounted]
  }
  @scala.inline
  implicit class RefCountedOps[Self <: RefCounted] (val x: Self) extends AnyVal {
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
    def setRef(value: () => RefCounted): Self = this.set("ref", js.Any.fromFunction0(value))
    @scala.inline
    def setUnref(value: () => RefCounted): Self = this.set("unref", js.Any.fromFunction0(value))
  }
  
}

