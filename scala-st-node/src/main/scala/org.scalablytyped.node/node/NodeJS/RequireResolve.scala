package org.scalablytyped.node.node.NodeJS

import org.scalablytyped.node.node.anon.Paths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireResolve extends js.Object {
  def apply(id: String): String = js.native
  def apply(id: String, options: Paths): String = js.native
  def paths(request: String): js.Array[String] | Null = js.native
}

