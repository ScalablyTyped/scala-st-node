package org.scalablytyped.node.expressServeStaticCore.mod

import org.scalablytyped.node.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Express extends Application {
  var request: Request[ParamsDictionary, _, _, ParsedQs] = js.native
  var response: Response[_] = js.native
}

