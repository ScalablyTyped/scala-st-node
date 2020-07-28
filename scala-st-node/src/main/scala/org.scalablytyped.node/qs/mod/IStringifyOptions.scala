package org.scalablytyped.node.qs.mod

import org.scalablytyped.node.qs.qsStrings.RFC1738
import org.scalablytyped.node.qs.qsStrings.RFC3986
import org.scalablytyped.node.qs.qsStrings.`iso-8859-1`
import org.scalablytyped.node.qs.qsStrings.`utf-8`
import org.scalablytyped.node.qs.qsStrings.brackets
import org.scalablytyped.node.qs.qsStrings.comma
import org.scalablytyped.node.qs.qsStrings.indices
import org.scalablytyped.node.qs.qsStrings.key
import org.scalablytyped.node.qs.qsStrings.repeat
import org.scalablytyped.node.qs.qsStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringifyOptions extends js.Object {
  var addQueryPrefix: js.UndefOr[Boolean] = js.undefined
  var allowDots: js.UndefOr[Boolean] = js.undefined
  var arrayFormat: js.UndefOr[indices | brackets | repeat | comma] = js.undefined
  var charset: js.UndefOr[`utf-8` | `iso-8859-1`] = js.undefined
  var charsetSentinel: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var encode: js.UndefOr[Boolean] = js.undefined
  var encodeValuesOnly: js.UndefOr[Boolean] = js.undefined
  var encoder: js.UndefOr[
    js.Function4[
      /* str */ js.Any, 
      /* defaultEncoder */ defaultEncoder, 
      /* charset */ String, 
      /* type */ key | value, 
      String
    ]
  ] = js.undefined
  var filter: js.UndefOr[
    (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _])
  ] = js.undefined
  var format: js.UndefOr[RFC1738 | RFC3986] = js.undefined
  var indices: js.UndefOr[Boolean] = js.undefined
  var serializeDate: js.UndefOr[js.Function1[/* d */ js.Date, String]] = js.undefined
  var skipNulls: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.undefined
  var strictNullHandling: js.UndefOr[Boolean] = js.undefined
}

object IStringifyOptions {
  @scala.inline
  def apply(): IStringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStringifyOptions]
  }
  @scala.inline
  implicit class IStringifyOptionsOps[Self <: IStringifyOptions] (val x: Self) extends AnyVal {
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
    def setAddQueryPrefix(value: Boolean): Self = this.set("addQueryPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddQueryPrefix: Self = this.set("addQueryPrefix", js.undefined)
    @scala.inline
    def setAllowDots(value: Boolean): Self = this.set("allowDots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDots: Self = this.set("allowDots", js.undefined)
    @scala.inline
    def setArrayFormat(value: indices | brackets | repeat | comma): Self = this.set("arrayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayFormat: Self = this.set("arrayFormat", js.undefined)
    @scala.inline
    def setCharset(value: `utf-8` | `iso-8859-1`): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    @scala.inline
    def setCharsetSentinel(value: Boolean): Self = this.set("charsetSentinel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharsetSentinel: Self = this.set("charsetSentinel", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setEncode(value: Boolean): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setEncodeValuesOnly(value: Boolean): Self = this.set("encodeValuesOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodeValuesOnly: Self = this.set("encodeValuesOnly", js.undefined)
    @scala.inline
    def setEncoder(
      value: (/* str */ js.Any, /* defaultEncoder */ defaultEncoder, /* charset */ String, /* type */ key | value) => String
    ): Self = this.set("encoder", js.Any.fromFunction4(value))
    @scala.inline
    def deleteEncoder: Self = this.set("encoder", js.undefined)
    @scala.inline
    def setFilterFunction2(value: (/* prefix */ String, /* value */ js.Any) => _): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def setFilterVarargs(value: (String | Double)*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _])): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFormat(value: RFC1738 | RFC3986): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIndices(value: Boolean): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
    @scala.inline
    def setSerializeDate(value: /* d */ js.Date => String): Self = this.set("serializeDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSerializeDate: Self = this.set("serializeDate", js.undefined)
    @scala.inline
    def setSkipNulls(value: Boolean): Self = this.set("skipNulls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipNulls: Self = this.set("skipNulls", js.undefined)
    @scala.inline
    def setSort(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStrictNullHandling(value: Boolean): Self = this.set("strictNullHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictNullHandling: Self = this.set("strictNullHandling", js.undefined)
  }
  
}

