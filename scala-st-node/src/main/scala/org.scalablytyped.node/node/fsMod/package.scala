package org.scalablytyped.node.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsMod {
  type Mode = scala.Double | java.lang.String
  type NoParamCallback = js.Function1[
    /* err */ org.scalablytyped.node.node.NodeJS.ErrnoException | scala.Null, 
    scala.Unit
  ]
  type OpenMode = scala.Double | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - `org.scalablytyped.node`.node.Buffer
    - `org.scalablytyped.node`.node.urlMod.URL_
  */
  type PathLike = org.scalablytyped.node.node.fsMod._PathLike | java.lang.String
  type WriteFileOptions = org.scalablytyped.node.node.anon.BaseEncodingOptionsmodeMoEncoding | java.lang.String | scala.Null
}
