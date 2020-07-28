package org.scalablytyped.node.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "fchown")
@js.native
object fchown extends js.Object {
  def apply(fd: Double, uid: Double, gid: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  @JSName("__promisify__")
  def promisify(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
}

