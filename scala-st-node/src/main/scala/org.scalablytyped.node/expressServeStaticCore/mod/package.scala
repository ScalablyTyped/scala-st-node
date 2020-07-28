package org.scalablytyped.node.expressServeStaticCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ApplicationRequestHandler[T] = org.scalablytyped.node.expressServeStaticCore.mod.IRouterHandler[T] with (org.scalablytyped.node.expressServeStaticCore.mod.IRouterMatcher[T, _]) with (js.Function1[
    /* repeated */ org.scalablytyped.node.expressServeStaticCore.mod.RequestHandlerParams[
      org.scalablytyped.node.expressServeStaticCore.mod.ParamsDictionary, 
      _, 
      _, 
      org.scalablytyped.node.qs.mod.ParsedQs
    ], 
    T
  ])
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Errback = js.Function1[/* err */ js.Error, scala.Unit]
  type ErrorRequestHandler[P /* <: org.scalablytyped.node.expressServeStaticCore.mod.Params */, ResBody, ReqBody, ReqQuery] = js.Function4[
    /* err */ js.Any, 
    /* req */ org.scalablytyped.node.expressServeStaticCore.mod.Request[P, ResBody, ReqBody, ReqQuery], 
    /* res */ org.scalablytyped.node.expressServeStaticCore.mod.Response[ResBody], 
    /* next */ org.scalablytyped.node.expressServeStaticCore.mod.NextFunction, 
    js.Any
  ]
  type Handler = org.scalablytyped.node.expressServeStaticCore.mod.RequestHandler[
    org.scalablytyped.node.expressServeStaticCore.mod.ParamsDictionary, 
    js.Any, 
    js.Any, 
    org.scalablytyped.node.qs.mod.ParsedQs
  ]
  type Params = org.scalablytyped.node.expressServeStaticCore.mod.ParamsDictionary | org.scalablytyped.node.expressServeStaticCore.mod.ParamsArray
  type ParamsArray = js.Array[java.lang.String]
  type ParamsDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type PathParams = java.lang.String | js.RegExp | (js.Array[java.lang.String | js.RegExp])
  type Query = org.scalablytyped.node.qs.mod.ParsedQs
  type RequestHandler[P /* <: org.scalablytyped.node.expressServeStaticCore.mod.Params */, ResBody, ReqBody, ReqQuery] = js.Function3[
    /* req */ org.scalablytyped.node.expressServeStaticCore.mod.Request[P, ResBody, ReqBody, ReqQuery], 
    /* res */ org.scalablytyped.node.expressServeStaticCore.mod.Response[ResBody], 
    /* next */ org.scalablytyped.node.expressServeStaticCore.mod.NextFunction, 
    js.Any
  ]
  type RequestHandlerParams[P /* <: org.scalablytyped.node.expressServeStaticCore.mod.Params */, ResBody, ReqBody, ReqQuery] = (org.scalablytyped.node.expressServeStaticCore.mod.RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (org.scalablytyped.node.expressServeStaticCore.mod.ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery]) | (js.Array[
    (org.scalablytyped.node.expressServeStaticCore.mod.RequestHandler[P, js.Any, js.Any, org.scalablytyped.node.qs.mod.ParsedQs]) | (org.scalablytyped.node.expressServeStaticCore.mod.ErrorRequestHandler[P, js.Any, js.Any, org.scalablytyped.node.qs.mod.ParsedQs])
  ])
  type RequestParamHandler = js.Function5[
    /* req */ org.scalablytyped.node.expressServeStaticCore.mod.Request[
      org.scalablytyped.node.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      org.scalablytyped.node.qs.mod.ParsedQs
    ], 
    /* res */ org.scalablytyped.node.expressServeStaticCore.mod.Response[js.Any], 
    /* next */ org.scalablytyped.node.expressServeStaticCore.mod.NextFunction, 
    /* value */ js.Any, 
    /* name */ java.lang.String, 
    js.Any
  ]
  type RequestRanges = org.scalablytyped.node.rangeParser.mod.Ranges
  type Router = org.scalablytyped.node.expressServeStaticCore.mod.IRouter
  type Send[ResBody, T] = js.Function1[/* body */ js.UndefOr[ResBody], T]
}
