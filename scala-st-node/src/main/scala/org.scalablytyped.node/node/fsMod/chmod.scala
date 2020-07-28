package org.scalablytyped.node.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "chmod")
@js.native
object chmod extends js.Object {
  def apply(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
}

