package org.scalablytyped.node.node.anon

import org.scalablytyped.node.node.NodeJS.ErrnoException
import org.scalablytyped.node.node.dnsMod.SrvRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofresolveSrv extends js.Object {
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  def __promisify__(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
}

