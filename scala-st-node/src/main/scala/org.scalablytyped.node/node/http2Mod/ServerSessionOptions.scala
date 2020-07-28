package org.scalablytyped.node.node.http2Mod

import org.scalablytyped.node.node.httpMod.IncomingMessage
import org.scalablytyped.node.node.httpMod.ServerResponse
import org.scalablytyped.node.node.netMod.Socket
import org.scalablytyped.node.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSessionOptions extends SessionOptions {
  var Http1IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, IncomingMessage]] = js.undefined
  var Http1ServerResponse: js.UndefOr[Instantiable1[/* req */ IncomingMessage, ServerResponse]] = js.undefined
  var Http2ServerRequest: js.UndefOr[
    Instantiable4[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* options */ ReadableOptions, 
      /* rawHeaders */ js.Array[String], 
      org.scalablytyped.node.node.http2Mod.Http2ServerRequest
    ]
  ] = js.undefined
  var Http2ServerResponse: js.UndefOr[
    Instantiable1[
      /* stream */ ServerHttp2Stream, 
      org.scalablytyped.node.node.http2Mod.Http2ServerResponse
    ]
  ] = js.undefined
}

object ServerSessionOptions {
  @scala.inline
  def apply(): ServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSessionOptions]
  }
  @scala.inline
  implicit class ServerSessionOptionsOps[Self <: ServerSessionOptions] (val x: Self) extends AnyVal {
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
    def setHttp1IncomingMessage(value: Instantiable1[/* socket */ Socket, IncomingMessage]): Self = this.set("Http1IncomingMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp1IncomingMessage: Self = this.set("Http1IncomingMessage", js.undefined)
    @scala.inline
    def setHttp1ServerResponse(value: Instantiable1[/* req */ IncomingMessage, ServerResponse]): Self = this.set("Http1ServerResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp1ServerResponse: Self = this.set("Http1ServerResponse", js.undefined)
    @scala.inline
    def setHttp2ServerRequest(
      value: Instantiable4[
          /* stream */ ServerHttp2Stream, 
          /* headers */ IncomingHttpHeaders, 
          /* options */ ReadableOptions, 
          /* rawHeaders */ js.Array[String], 
          Http2ServerRequest
        ]
    ): Self = this.set("Http2ServerRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp2ServerRequest: Self = this.set("Http2ServerRequest", js.undefined)
    @scala.inline
    def setHttp2ServerResponse(value: Instantiable1[/* stream */ ServerHttp2Stream, Http2ServerResponse]): Self = this.set("Http2ServerResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp2ServerResponse: Self = this.set("Http2ServerResponse", js.undefined)
  }
  
}

