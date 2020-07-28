package org.scalablytyped.node.node.anon

import org.scalablytyped.node.node.NodeJS.ErrnoException
import org.scalablytyped.node.node.dnsMod.AnyRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofresolveAny extends js.Object {
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  def __promisify__(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
}

