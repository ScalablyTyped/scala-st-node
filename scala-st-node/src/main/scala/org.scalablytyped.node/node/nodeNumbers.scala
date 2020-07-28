package org.scalablytyped.node.node

import org.scalablytyped.node.node.readlineMod.Direction
import org.scalablytyped.node.node.v8Mod.DoesZapCodeSpaceFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeNumbers {
  @js.native
  sealed trait `-1`
    extends Direction
       with org.scalablytyped.node.node.ttyMod.Direction
  
  @js.native
  sealed trait `0`
    extends Direction
       with org.scalablytyped.node.node.ttyMod.Direction
       with DoesZapCodeSpaceFlag
  
  @js.native
  sealed trait `1`
    extends Direction
       with org.scalablytyped.node.node.ttyMod.Direction
       with DoesZapCodeSpaceFlag
  
  @js.native
  sealed trait `2` extends js.Object
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
}

