package org.scalablytyped.node.node.fsMod

import org.scalablytyped.node.node.anon.AutoClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "createReadStream")
@js.native
object createReadStream extends js.Object {
  def apply(path: PathLike): ReadStream = js.native
  def apply(path: PathLike, options: AutoClose): ReadStream = js.native
  def apply(path: PathLike, options: String): ReadStream = js.native
}

