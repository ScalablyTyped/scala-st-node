package org.scalablytyped.node.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object childProcessMod {
  type Serializable = java.lang.String | js.Object | scala.Double | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - `org.scalablytyped.node`.node.nodeStrings.pipe
    - `org.scalablytyped.node`.node.nodeStrings.ignore
    - `org.scalablytyped.node`.node.nodeStrings.inherit
    - js.Array[
  js.UndefOr[
    `org.scalablytyped.node`.node.nodeStrings.pipe | `org.scalablytyped.node`.node.nodeStrings.ipc | `org.scalablytyped.node`.node.nodeStrings.ignore | `org.scalablytyped.node`.node.nodeStrings.inherit | `org.scalablytyped.node`.node.streamMod.Stream | scala.Double | scala.Null
  ]]
  */
  type StdioOptions = org.scalablytyped.node.node.childProcessMod._StdioOptions | (js.Array[
    js.UndefOr[
      org.scalablytyped.node.node.nodeStrings.pipe | org.scalablytyped.node.node.nodeStrings.ipc | org.scalablytyped.node.node.nodeStrings.ignore | org.scalablytyped.node.node.nodeStrings.inherit | org.scalablytyped.node.node.streamMod.Stream | scala.Double | scala.Null
    ]
  ])
  type StdioPipe = js.UndefOr[scala.Null | org.scalablytyped.node.node.nodeStrings.pipe]
}
