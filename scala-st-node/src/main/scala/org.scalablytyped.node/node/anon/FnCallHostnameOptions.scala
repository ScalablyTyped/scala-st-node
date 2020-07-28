package org.scalablytyped.node.node.anon

import org.scalablytyped.node.node.dnsMod.RecordWithTtl
import org.scalablytyped.node.node.dnsMod.ResolveOptions
import org.scalablytyped.node.node.dnsMod.ResolveWithTtlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallHostnameOptions extends js.Object {
  def apply(hostname: String): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  def apply(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
}

