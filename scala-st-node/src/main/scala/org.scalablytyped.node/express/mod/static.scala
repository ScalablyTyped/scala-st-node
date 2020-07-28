package org.scalablytyped.node.express.mod

import org.scalablytyped.node.express.anon.Typeofm
import org.scalablytyped.node.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
  */
@JSImport("express", "static")
@js.native
object static extends js.Object {
  var mime: Typeofm = js.native
  def apply(root: String): org.scalablytyped.node.expressServeStaticCore.mod.Handler = js.native
  def apply(root: String, options: ServeStaticOptions): org.scalablytyped.node.expressServeStaticCore.mod.Handler = js.native
  def serveStatic(root: String): org.scalablytyped.node.expressServeStaticCore.mod.Handler = js.native
  def serveStatic(root: String, options: ServeStaticOptions): org.scalablytyped.node.expressServeStaticCore.mod.Handler = js.native
}

