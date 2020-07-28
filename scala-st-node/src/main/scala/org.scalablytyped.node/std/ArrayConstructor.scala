package org.scalablytyped.node.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayConstructor
  extends Instantiable0[js.Array[js.Any]]
     with Instantiable1[
      (/* arrayLength */ Double) | (/* items (repeated) */ js.Object), 
      js.Array[js.Any | js.Object]
    ] {
  def apply(): js.Array[_] = js.native
  def apply(arrayLength: Double): js.Array[_] = js.native
  def apply[T](items: T*): js.Array[T] = js.native
  def isArray(arg: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
}

