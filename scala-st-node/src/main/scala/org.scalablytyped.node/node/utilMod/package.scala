package org.scalablytyped.node.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilMod {
  type CustomInspectFunction = js.Function2[
    /* depth */ scala.Double, 
    /* options */ org.scalablytyped.node.node.utilMod.InspectOptionsStylized, 
    java.lang.String
  ]
  type InspectOptions = org.scalablytyped.node.node.NodeJS.InspectOptions
}
