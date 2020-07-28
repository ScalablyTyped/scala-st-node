package org.scalablytyped.node.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberConstructor
  extends Instantiable0[Number]
     with Instantiable1[/* value */ js.Any, Number] {
  /** The largest number that can be represented in JavaScript. Equal to approximately 1.79E+308. */
  val MAX_VALUE: Double = js.native
  /** The closest number to zero that can be represented in JavaScript. Equal to approximately 5.00E-324. */
  val MIN_VALUE: Double = js.native
  /**
    * A value that is less than the largest negative number that can be represented in JavaScript.
    * JavaScript displays NEGATIVE_INFINITY values as -infinity.
    */
  val NEGATIVE_INFINITY: Double = js.native
  /**
    * A value that is not a number.
    * In equality comparisons, NaN does not equal any value, including itself. To test whether a value is equivalent to NaN, use the isNaN function.
    */
  val NaN: Double = js.native
  /**
    * A value greater than the largest number that can be represented in JavaScript.
    * JavaScript displays POSITIVE_INFINITY values as infinity.
    */
  val POSITIVE_INFINITY: Double = js.native
  def apply(): Double = js.native
  def apply(value: js.Any): Double = js.native
}

