package org.scalablytyped.node.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ org.scalablytyped.node.connect.mod.IncomingMessage, 
    /* res */ org.scalablytyped.node.node.httpMod.ServerResponse, 
    /* next */ org.scalablytyped.node.connect.mod.NextFunction, 
    scala.Unit
  ]
  type HandleFunction = org.scalablytyped.node.connect.mod.SimpleHandleFunction | org.scalablytyped.node.connect.mod.NextHandleFunction | org.scalablytyped.node.connect.mod.ErrorHandleFunction
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type NextHandleFunction = js.Function3[
    /* req */ org.scalablytyped.node.connect.mod.IncomingMessage, 
    /* res */ org.scalablytyped.node.node.httpMod.ServerResponse, 
    /* next */ org.scalablytyped.node.connect.mod.NextFunction, 
    scala.Unit
  ]
  type ServerHandle = org.scalablytyped.node.connect.mod.HandleFunction | org.scalablytyped.node.node.httpMod.Server
  type SimpleHandleFunction = js.Function2[
    /* req */ org.scalablytyped.node.connect.mod.IncomingMessage, 
    /* res */ org.scalablytyped.node.node.httpMod.ServerResponse, 
    scala.Unit
  ]
}
