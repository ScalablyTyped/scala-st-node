package org.scalablytyped.node.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readlineMod {
  type AsyncCompleter = js.Function2[
    /* line */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[scala.Null | js.Error], 
      /* result */ js.UndefOr[org.scalablytyped.node.node.readlineMod.CompleterResult], 
      scala.Unit
    ], 
    js.Any
  ]
  type Completer = js.Function1[
    /* line */ java.lang.String, 
    org.scalablytyped.node.node.readlineMod.CompleterResult
  ]
  type CompleterResult = js.Tuple2[js.Array[java.lang.String], java.lang.String]
  type ReadLine = org.scalablytyped.node.node.readlineMod.Interface
}
