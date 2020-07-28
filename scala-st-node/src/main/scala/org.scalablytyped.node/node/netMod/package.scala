package org.scalablytyped.node.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object netMod {
  type LookupFunction = js.Function3[
    /* hostname */ java.lang.String, 
    /* options */ org.scalablytyped.node.node.dnsMod.LookupOneOptions, 
    /* callback */ js.Function3[
      /* err */ org.scalablytyped.node.node.NodeJS.ErrnoException | scala.Null, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ], 
    scala.Unit
  ]
}
