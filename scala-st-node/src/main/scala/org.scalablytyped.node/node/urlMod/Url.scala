package org.scalablytyped.node.node.urlMod

import org.scalablytyped.node.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Output of `url.parse`
trait Url extends js.Object {
  var auth: String | Null
  var hash: String | Null
  var host: String | Null
  var hostname: String | Null
  var href: String
  var path: String | Null
  var pathname: String | Null
  var port: String | Null
  var protocol: String | Null
  var query: String | Null | ParsedUrlQuery
  var search: String | Null
  var slashes: Boolean | Null
}

object Url {
  @scala.inline
  def apply(href: String): Url = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
  @scala.inline
  implicit class UrlOps[Self <: Url] (val x: Self) extends AnyVal {
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthNull: Self = this.set("auth", null)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashNull: Self = this.set("hash", null)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostNull: Self = this.set("host", null)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostnameNull: Self = this.set("hostname", null)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathNull: Self = this.set("path", null)
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathnameNull: Self = this.set("pathname", null)
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortNull: Self = this.set("port", null)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolNull: Self = this.set("protocol", null)
    @scala.inline
    def setQuery(value: String | ParsedUrlQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchNull: Self = this.set("search", null)
    @scala.inline
    def setSlashes(value: Boolean): Self = this.set("slashes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlashesNull: Self = this.set("slashes", null)
  }
  
}

