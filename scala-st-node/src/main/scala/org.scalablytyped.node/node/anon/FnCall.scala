package org.scalablytyped.node.node.anon

import org.scalablytyped.node.node.dnsMod.AnyRecord
import org.scalablytyped.node.node.dnsMod.MxRecord
import org.scalablytyped.node.node.dnsMod.NaptrRecord
import org.scalablytyped.node.node.dnsMod.SoaRecord
import org.scalablytyped.node.node.dnsMod.SrvRecord
import org.scalablytyped.node.node.nodeStrings.A
import org.scalablytyped.node.node.nodeStrings.AAAA
import org.scalablytyped.node.node.nodeStrings.ANY
import org.scalablytyped.node.node.nodeStrings.CNAME
import org.scalablytyped.node.node.nodeStrings.MX
import org.scalablytyped.node.node.nodeStrings.NAPTR
import org.scalablytyped.node.node.nodeStrings.NS
import org.scalablytyped.node.node.nodeStrings.PTR
import org.scalablytyped.node.node.nodeStrings.SOA
import org.scalablytyped.node.node.nodeStrings.SRV
import org.scalablytyped.node.node.nodeStrings.TXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(hostname: String): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  def apply(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  def apply(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  def apply(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  def apply(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  def apply(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
  def apply(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
}

