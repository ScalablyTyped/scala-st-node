package org.scalablytyped.node.expressServeStaticCore.mod

import org.scalablytyped.node.expressServeStaticCore.expressServeStaticCoreStrings.all
import org.scalablytyped.node.expressServeStaticCore.expressServeStaticCoreStrings.delete
import org.scalablytyped.node.expressServeStaticCore.expressServeStaticCoreStrings.get
import org.scalablytyped.node.expressServeStaticCore.expressServeStaticCoreStrings.head
import org.scalablytyped.node.expressServeStaticCore.expressServeStaticCoreStrings.options
import org.scalablytyped.node.expressServeStaticCore.expressServeStaticCoreStrings.patch
import org.scalablytyped.node.expressServeStaticCore.expressServeStaticCoreStrings.post
import org.scalablytyped.node.expressServeStaticCore.expressServeStaticCoreStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterMatcher[T, Method /* <: all | get | post | put | delete | patch | options | head */] extends js.Object {
  def apply(path: PathParams, subApplication: Application): T = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def apply[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): T = js.native
}

