package org.scalablytyped.node.express

import org.scalablytyped.node.mime.mod.TypeMap
import org.scalablytyped.node.qs.anon.IParseOptionsdecodernever
import org.scalablytyped.node.qs.mod.IParseOptions
import org.scalablytyped.node.qs.mod.ParsedQs
import org.scalablytyped.node.qs.mod.UnknownFacade
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(str: String): ParsedQs = js.native
    def apply(str: String, options: IParseOptionsdecodernever): ParsedQs = js.native
    def apply(str: String, options: IParseOptions): StringDictionary[UnknownFacade] = js.native
  }
  
  @js.native
  trait Typeofm extends js.Object {
    def define(mimes: TypeMap): Unit = js.native
    def define(mimes: TypeMap, force: Boolean): Unit = js.native
    def getExtension(mime: String): String | Null = js.native
    def getType(path: String): String | Null = js.native
  }
  
}

