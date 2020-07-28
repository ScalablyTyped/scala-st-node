package org.scalablytyped.node.express.mod

import org.scalablytyped.node.expressServeStaticCore.mod.ParamsDictionary
import org.scalablytyped.node.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * These are the exposed prototypes.
    */
  var application: Application_ = js.native
  var request: Request_[ParamsDictionary, js.Any, js.Any, Query] = js.native
  var response: Response_[js.Any] = js.native
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  def apply(): org.scalablytyped.node.expressServeStaticCore.mod.Express = js.native
}

