package org.scalablytyped.node.node.NodeJS

import org.scalablytyped.node.node.NodeModule
import org.scalablytyped.node.node.anon.Paths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Require extends js.Object {
  var cache: Dict[NodeModule] = js.native
  /**
    * @deprecated
    */
  var extensions: RequireExtensions = js.native
  var main: js.UndefOr[Module] = js.native
  @JSName("resolve")
  var resolve_Original: RequireResolve = js.native
  /* tslint:disable-next-line:callable-types */
  def apply(id: String): js.Any = js.native
  def resolve(id: String): String = js.native
  def resolve(id: String, options: Paths): String = js.native
}

