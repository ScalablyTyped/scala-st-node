package org.scalablytyped.node.node.anon

import org.scalablytyped.node.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofresolveCname extends js.Object {
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def __promisify__(hostname: String): js.Promise[js.Array[String]] = js.native
}

