package org.scalablytyped.node.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "rmdir")
@js.native
object rmdir extends js.Object {
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, options: RmDirAsyncOptions, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: RmDirAsyncOptions): js.Promise[Unit] = js.native
}

