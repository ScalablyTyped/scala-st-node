package org.scalablytyped.node.qs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** @deprecated - UnknownFacade is more clear about what's going on */
  type PoorMansUnknown = org.scalablytyped.node.qs.mod.UnknownFacade
  // TODO: The value type here is a version of `unknown` which replicates with an acceptably lossy amount of accuracy.
  // When these types support TypeScript 3.0+, we can replace this with `unknown`.
  type UnknownFacade = js.UndefOr[js.Object | scala.Null]
  type defaultDecoder = js.Function3[
    /* str */ java.lang.String, 
    /* decoder */ js.UndefOr[js.Any], 
    /* charset */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type defaultEncoder = js.Function3[
    /* str */ js.Any, 
    /* defaultEncoder */ js.UndefOr[js.Any], 
    /* charset */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
}
