package org.scalablytyped.node.node.eventsMod

import org.scalablytyped.node.node.anon.Once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMEventTarget extends js.Object {
  def addEventListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def addEventListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit], opts: Once): js.Any = js.native
}

