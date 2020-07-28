package org.scalablytyped.node.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Int8ArrayConstructor
  extends Instantiable1[
      js.typedarray.ArrayBuffer | (/* arrayOrArrayBuffer */ ArrayLike[Double]) | (/* length */ Double), 
      js.typedarray.Int8Array
    ]
     with Instantiable2[js.typedarray.ArrayBuffer, /* byteOffset */ Double, js.typedarray.Int8Array]
     with Instantiable3[
      js.typedarray.ArrayBuffer, 
      /* byteOffset */ Double, 
      /* length */ Double, 
      js.typedarray.Int8Array
    ] {
  /**
    * The size in bytes of each element in the array.
    */
  val BYTES_PER_ELEMENT: Double = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    */
  def from(arrayLike: ArrayLike[Double]): js.typedarray.Int8Array = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from[T](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, Double]): js.typedarray.Int8Array = js.native
  def from[T](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, Double], thisArg: js.Any): js.typedarray.Int8Array = js.native
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  def of(items: Double*): js.typedarray.Int8Array = js.native
}

