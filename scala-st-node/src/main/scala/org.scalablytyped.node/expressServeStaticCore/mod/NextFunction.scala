package org.scalablytyped.node.expressServeStaticCore.mod

import org.scalablytyped.node.expressServeStaticCore.expressServeStaticCoreStrings.router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextFunction extends js.Object {
  def apply(): Unit = js.native
  /**
    * "Break-out" of a router by calling {next('router')};
    * @see {https://expressjs.com/en/guide/using-middleware.html#middleware.router}
    */
  def apply(deferToNext: router): Unit = js.native
  def apply(err: js.Any): Unit = js.native
}

