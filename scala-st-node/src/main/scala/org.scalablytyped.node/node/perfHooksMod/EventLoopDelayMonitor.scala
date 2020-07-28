package org.scalablytyped.node.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLoopDelayMonitor extends js.Object {
  /**
    * The number of times the event loop delay exceeded the maximum 1 hour eventloop delay threshold.
    */
  val exceeds: Double
  /**
    * The maximum recorded event loop delay.
    */
  val max: Double
  /**
    * The mean of the recorded event loop delays.
    */
  val mean: Double
  /**
    * The minimum recorded event loop delay.
    */
  val min: Double
  /**
    * A `Map` object detailing the accumulated percentile distribution.
    */
  val percentiles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Map<number, number> */ js.Any
  /**
    * The standard deviation of the recorded event loop delays.
    */
  val stddev: Double
  /**
    * Disables the event loop delay sample timer. Returns `true` if the timer was stopped, `false` if it was already stopped.
    */
  def disable(): Boolean
  /**
    * Enables the event loop delay sample timer. Returns `true` if the timer was started, `false` if it was already started.
    */
  def enable(): Boolean
  /**
    * Returns the value at the given percentile.
    * @param percentile A percentile value between 1 and 100.
    */
  def percentile(percentile: Double): Double
  /**
    * Resets the collected histogram data.
    */
  def reset(): Unit
}

object EventLoopDelayMonitor {
  @scala.inline
  def apply(
    disable: () => Boolean,
    enable: () => Boolean,
    exceeds: Double,
    max: Double,
    mean: Double,
    min: Double,
    percentile: Double => Double,
    percentiles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Map<number, number> */ js.Any,
    reset: () => Unit,
    stddev: Double
  ): EventLoopDelayMonitor = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), exceeds = exceeds.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], percentile = js.Any.fromFunction1(percentile), percentiles = percentiles.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stddev = stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLoopDelayMonitor]
  }
  @scala.inline
  implicit class EventLoopDelayMonitorOps[Self <: EventLoopDelayMonitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisable(value: () => Boolean): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => Boolean): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setExceeds(value: Double): Self = this.set("exceeds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMean(value: Double): Self = this.set("mean", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentile(value: Double => Double): Self = this.set("percentile", js.Any.fromFunction1(value))
    @scala.inline
    def setPercentiles(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Map<number, number> */ js.Any
    ): Self = this.set("percentiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setStddev(value: Double): Self = this.set("stddev", value.asInstanceOf[js.Any])
  }
  
}

