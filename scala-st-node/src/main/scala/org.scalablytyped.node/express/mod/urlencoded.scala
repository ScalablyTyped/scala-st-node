package org.scalablytyped.node.express.mod

import org.scalablytyped.node.bodyParser.mod.OptionsUrlencoded
import org.scalablytyped.node.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
  * @since 4.16.0
  */
@JSImport("express", "urlencoded")
@js.native
object urlencoded extends js.Object {
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsUrlencoded): NextHandleFunction = js.native
}

