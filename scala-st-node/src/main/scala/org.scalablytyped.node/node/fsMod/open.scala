package org.scalablytyped.node.node.fsMod

import org.scalablytyped.node.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "open")
@js.native
object open extends js.Object {
  def apply(
    path: PathLike,
    flags: OpenMode,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: OpenMode,
    mode: js.UndefOr[Mode],
    callback: js.Function2[ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: OpenMode,
    mode: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  /**
    * Asynchronous open(2) - open and possibly create a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike, flags: OpenMode): js.Promise[Double] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, flags: OpenMode, mode: Mode): js.Promise[Double] = js.native
}

