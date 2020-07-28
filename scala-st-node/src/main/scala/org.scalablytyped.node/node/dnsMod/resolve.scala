package org.scalablytyped.node.node.dnsMod

import org.scalablytyped.node.node.NodeJS.ErrnoException
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

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("dns", "resolve")
@js.native
object resolve extends js.Object {
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: AAAA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: ANY,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: A,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: CNAME,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: MX,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: NAPTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: NS,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: PTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: SOA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: SRV,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: TXT,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
      Unit
    ]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(hostname: String): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def promisify(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  @JSName("__promisify__")
  def promisify_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def promisify_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def promisify_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  @JSName("__promisify__")
  def promisify_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def promisify_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  @JSName("__promisify__")
  def promisify_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  @JSName("__promisify__")
  def promisify_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def promisify_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def promisify_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  @JSName("__promisify__")
  def promisify_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  @JSName("__promisify__")
  def promisify_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
}

