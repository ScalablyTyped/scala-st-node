package org.scalablytyped.node.node.httpMod

import org.scalablytyped.node.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", "get")
@js.native
object get extends js.Object {
  def apply(options: RequestOptions): ClientRequest = js.native
  def apply(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(options: URL_): ClientRequest = js.native
  def apply(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(options: String): ClientRequest = js.native
  def apply(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(url: URL_, options: RequestOptions): ClientRequest = js.native
  def apply(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(url: String, options: RequestOptions): ClientRequest = js.native
  def apply(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}

