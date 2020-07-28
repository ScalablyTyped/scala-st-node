package org.scalablytyped.node.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zlibMod {
  type CompressCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* result */ org.scalablytyped.node.node.Buffer, 
    scala.Unit
  ]
  type InputType = java.lang.String | js.typedarray.ArrayBuffer | org.scalablytyped.node.node.NodeJS.ArrayBufferView
}
