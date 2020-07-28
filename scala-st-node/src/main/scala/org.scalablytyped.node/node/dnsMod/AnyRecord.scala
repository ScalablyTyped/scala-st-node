package org.scalablytyped.node.node.dnsMod

import org.scalablytyped.node.node.nodeStrings.A
import org.scalablytyped.node.node.nodeStrings.AAAA
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

/* Rewritten from type alias, can be one of: 
  - `org.scalablytyped.node`.node.dnsMod.AnyARecord
  - `org.scalablytyped.node`.node.dnsMod.AnyAaaaRecord
  - `org.scalablytyped.node`.node.dnsMod.AnyCnameRecord
  - `org.scalablytyped.node`.node.dnsMod.AnyMxRecord
  - `org.scalablytyped.node`.node.dnsMod.AnyNaptrRecord
  - `org.scalablytyped.node`.node.dnsMod.AnyNsRecord
  - `org.scalablytyped.node`.node.dnsMod.AnyPtrRecord
  - `org.scalablytyped.node`.node.dnsMod.AnySoaRecord
  - `org.scalablytyped.node`.node.dnsMod.AnySrvRecord
  - `org.scalablytyped.node`.node.dnsMod.AnyTxtRecord
*/
trait AnyRecord extends js.Object

object AnyRecord {
  @scala.inline
  def AnyCnameRecord(`type`: CNAME, value: String): AnyRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyNaptrRecord(
    flags: String,
    order: Double,
    preference: Double,
    regexp: String,
    replacement: String,
    service: String,
    `type`: NAPTR
  ): AnyRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnySoaRecord(
    expire: Double,
    hostmaster: String,
    minttl: Double,
    nsname: String,
    refresh: Double,
    retry: Double,
    serial: Double,
    `type`: SOA
  ): AnyRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyTxtRecord(entries: js.Array[String], `type`: TXT): AnyRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnySrvRecord(name: String, port: Double, priority: Double, `type`: SRV, weight: Double): AnyRecord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyAaaaRecord(address: String, ttl: Double, `type`: AAAA): AnyRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyPtrRecord(`type`: PTR, value: String): AnyRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyARecord(address: String, ttl: Double, `type`: A): AnyRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyMxRecord(exchange: String, priority: Double, `type`: MX): AnyRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyNsRecord(`type`: NS, value: String): AnyRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
}

