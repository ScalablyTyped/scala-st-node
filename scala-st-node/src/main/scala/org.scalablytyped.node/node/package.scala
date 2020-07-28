package org.scalablytyped.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object node {
  type NodeModule = org.scalablytyped.node.node.NodeJS.Module
  /*-----------------------------------------------*
    *                                               *
    *                   GLOBAL                      *
    *                                               *
    ------------------------------------------------*/
  // For backwards compability
  type NodeRequire = org.scalablytyped.node.node.NodeJS.Require
  type RequireResolve = org.scalablytyped.node.node.NodeJS.RequireResolve
}
