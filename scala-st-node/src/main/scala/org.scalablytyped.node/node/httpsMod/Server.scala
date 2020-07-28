package org.scalablytyped.node.node.httpsMod

import org.scalablytyped.node.node.httpMod.HttpBase
import org.scalablytyped.node.node.httpMod.RequestListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", "Server")
@js.native
class Server ()
  extends org.scalablytyped.node.node.tlsMod.Server
     with HttpBase {
  def this(options: ServerOptions) = this()
  def this(requestListener: RequestListener) = this()
  def this(options: ServerOptions, requestListener: RequestListener) = this()
}

