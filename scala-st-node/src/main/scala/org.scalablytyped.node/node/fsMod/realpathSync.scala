package org.scalablytyped.node.node.fsMod

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "realpathSync")
@js.native
object realpathSync extends js.Object {
  def apply(path: PathLike): String = js.native
  def apply(path: PathLike, options: BufferEncoding): String = js.native
  def apply(path: PathLike, options: BaseEncodingOptions): String = js.native
  def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  def apply(path: PathLike, options: String): String | Buffer = js.native
  def native(path: PathLike): String = js.native
  def native(path: PathLike, options: BufferEncoding): String = js.native
  def native(path: PathLike, options: BaseEncodingOptions): String = js.native
  def native(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  def native(path: PathLike, options: String): String | Buffer = js.native
  @JSName("native")
  def native_Union(path: PathLike): String | Buffer = js.native
  @JSName("native")
  def native_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
}

