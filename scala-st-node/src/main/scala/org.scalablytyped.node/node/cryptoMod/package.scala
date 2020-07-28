package org.scalablytyped.node.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type BinaryLike = java.lang.String | org.scalablytyped.node.node.NodeJS.ArrayBufferView
  type CipherKey = org.scalablytyped.node.node.cryptoMod.BinaryLike | org.scalablytyped.node.node.cryptoMod.KeyObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - `org.scalablytyped.node`.node.Buffer
    - `org.scalablytyped.node`.node.cryptoMod.KeyObject
  */
  type KeyLike = org.scalablytyped.node.node.cryptoMod._KeyLike | java.lang.String
}
