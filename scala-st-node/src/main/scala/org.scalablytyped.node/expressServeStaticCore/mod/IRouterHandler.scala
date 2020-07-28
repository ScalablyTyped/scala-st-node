package org.scalablytyped.node.expressServeStaticCore.mod

import org.scalablytyped.node.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterHandler[T] extends js.Object {
  def apply(
    handlers: ((RequestHandler[ParamsDictionary, _, _, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, _, _, ParsedQs]))*
  ): T = js.native
}

