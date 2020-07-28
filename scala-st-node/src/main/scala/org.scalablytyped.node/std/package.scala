package org.scalablytyped.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object std {
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[js.PropertyDescriptor]
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: /* keyof any */ java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[T]
}
