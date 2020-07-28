package org.scalablytyped.node.node.fsMod

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.BufferEncoding
import org.scalablytyped.node.node.anon.BaseEncodingOptionswithFi
import org.scalablytyped.node.node.anon.BaseEncodingOptionswithFiEncoding
import org.scalablytyped.node.node.anon.Encoding
import org.scalablytyped.node.node.anon.WithFileTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readdirSync")
@js.native
object readdirSync extends js.Object {
  def apply(path: PathLike): js.Array[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  def apply(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
  def apply(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
}

