package org.scalablytyped.node.node.anon

import org.scalablytyped.node.node.NodeJS.ErrnoException
import org.scalablytyped.node.node.dnsMod.SoaRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofresolveSoa extends js.Object {
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
  ): Unit = js.native
  def __promisify__(hostname: String): js.Promise[SoaRecord] = js.native
}

