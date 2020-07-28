package org.scalablytyped.node.node.NodeJS

import org.scalablytyped.node.node.anon.FnCallSRadix
import org.scalablytyped.node.node.anon.FnCallUriComponent
import org.scalablytyped.node.node.anon.TypeofBuffer
import org.scalablytyped.node.std.ArrayBufferConstructor
import org.scalablytyped.node.std.ArrayConstructor
import org.scalablytyped.node.std.BooleanConstructor
import org.scalablytyped.node.std.DataViewConstructor
import org.scalablytyped.node.std.DateConstructor
import org.scalablytyped.node.std.ErrorConstructor
import org.scalablytyped.node.std.EvalErrorConstructor
import org.scalablytyped.node.std.Float32ArrayConstructor
import org.scalablytyped.node.std.Float64ArrayConstructor
import org.scalablytyped.node.std.FunctionConstructor
import org.scalablytyped.node.std.Int16ArrayConstructor
import org.scalablytyped.node.std.Int32ArrayConstructor
import org.scalablytyped.node.std.Int8ArrayConstructor
import org.scalablytyped.node.std.NumberConstructor
import org.scalablytyped.node.std.ObjectConstructor
import org.scalablytyped.node.std.RangeErrorConstructor
import org.scalablytyped.node.std.ReferenceErrorConstructor
import org.scalablytyped.node.std.RegExpConstructor
import org.scalablytyped.node.std.StringConstructor
import org.scalablytyped.node.std.SyntaxErrorConstructor
import org.scalablytyped.node.std.TypeErrorConstructor
import org.scalablytyped.node.std.URIErrorConstructor
import org.scalablytyped.node.std.Uint16ArrayConstructor
import org.scalablytyped.node.std.Uint32ArrayConstructor
import org.scalablytyped.node.std.Uint8ArrayConstructor
import org.scalablytyped.node.std.Uint8ClampedArrayConstructor
import org.scalablytyped.node.std.global.Boolean
import org.scalablytyped.node.std.global.Number
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  var ArrayBuffer: ArrayBufferConstructor with (Instantiable1[/* byteLength */ Double, js.typedarray.ArrayBuffer]) = js.native
  @JSName("Array")
  var Array_Original: ArrayConstructor with (Instantiable1[/* arrayLength */ Double, js.Array[js.Object]]) = js.native
  @JSName("Boolean")
  var Boolean_Original: BooleanConstructor with Instantiable0[Boolean] = js.native
  var Buffer: TypeofBuffer = js.native
  var DataView: DataViewConstructor with (Instantiable1[js.typedarray.ArrayBuffer, js.typedarray.DataView]) = js.native
  @JSName("Date")
  var Date_Original: DateConstructor with Instantiable0[js.Date] = js.native
  @JSName("Error")
  var Error_Original: ErrorConstructor with Instantiable0[js.Error] = js.native
  @JSName("EvalError")
  var EvalError_Original: EvalErrorConstructor with Instantiable0[js.EvalError] = js.native
  var Float32Array: Float32ArrayConstructor with (Instantiable1[/* length */ Double, js.typedarray.Float32Array]) = js.native
  var Float64Array: Float64ArrayConstructor with (Instantiable1[/* length */ Double, js.typedarray.Float64Array]) = js.native
  @JSName("Function")
  var Function_Original: FunctionConstructor with (Instantiable1[/* args (repeated) */ String, js.Function]) = js.native
  var Infinity: Double = js.native
  var Int16Array: Int16ArrayConstructor with (Instantiable1[/* length */ Double, js.typedarray.Int16Array]) = js.native
  var Int32Array: Int32ArrayConstructor with (Instantiable1[/* length */ Double, js.typedarray.Int32Array]) = js.native
  var Int8Array: Int8ArrayConstructor with (Instantiable1[/* length */ Double, js.typedarray.Int8Array]) = js.native
  var Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any = js.native
  var JSON: org.scalablytyped.node.std.JSON = js.native
  var Map: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapConstructor */ js.Any = js.native
  var Math: org.scalablytyped.node.std.Math = js.native
  var NaN: Double = js.native
  @JSName("Number")
  var Number_Original: NumberConstructor with Instantiable0[Number] = js.native
  @JSName("Object")
  var Object_Original: ObjectConstructor with Instantiable0[js.Object] = js.native
  var Promise: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Promise */ js.Any = js.native
  @JSName("RangeError")
  var RangeError_Original: RangeErrorConstructor with Instantiable0[js.RangeError] = js.native
  @JSName("ReferenceError")
  var ReferenceError_Original: ReferenceErrorConstructor with Instantiable0[js.ReferenceError] = js.native
  @JSName("RegExp")
  var RegExp_Original: RegExpConstructor with (Instantiable1[/* pattern */ js.RegExp, js.RegExp]) = js.native
  var Set: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetConstructor */ js.Any = js.native
  @JSName("String")
  var String_Original: StringConstructor with Instantiable0[org.scalablytyped.node.std.global.String] = js.native
  var Symbol: js.Function = js.native
  @JSName("SyntaxError")
  var SyntaxError_Original: SyntaxErrorConstructor with Instantiable0[js.SyntaxError] = js.native
  @JSName("TypeError")
  var TypeError_Original: TypeErrorConstructor with Instantiable0[js.TypeError] = js.native
  @JSName("URIError")
  var URIError_Original: URIErrorConstructor with Instantiable0[js.URIError] = js.native
  var Uint16Array: Uint16ArrayConstructor with (Instantiable1[/* length */ Double, js.typedarray.Uint16Array]) = js.native
  var Uint32Array: Uint32ArrayConstructor with (Instantiable1[/* length */ Double, js.typedarray.Uint32Array]) = js.native
  var Uint8Array: Uint8ArrayConstructor with (Instantiable1[/* length */ Double, js.typedarray.Uint8Array]) = js.native
  var Uint8ClampedArray: Uint8ClampedArrayConstructor with (Instantiable1[/* length */ Double, js.typedarray.Uint8ClampedArray]) = js.native
  var WeakMap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WeakMapConstructor */ js.Any = js.native
  var WeakSet: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WeakSetConstructor */ js.Any = js.native
  @JSName("decodeURIComponent")
  var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ String, String] = js.native
  @JSName("decodeURI")
  var decodeURI_Original: js.Function1[/* encodedURI */ String, String] = js.native
  @JSName("encodeURIComponent")
  var encodeURIComponent_Original: FnCallUriComponent = js.native
  @JSName("encodeURI")
  var encodeURI_Original: js.Function1[/* uri */ String, String] = js.native
  @JSName("eval")
  var eval_Original: js.Function1[/* x */ String, _] = js.native
  var global: Global = js.native
  @JSName("isFinite")
  var isFinite_Original: js.Function1[/* number */ Double, scala.Boolean] = js.native
  @JSName("isNaN")
  var isNaN_Original: js.Function1[/* number */ Double, scala.Boolean] = js.native
  @JSName("parseFloat")
  var parseFloat_Original: js.Function1[/* string */ String, Double] = js.native
  @JSName("parseInt")
  var parseInt_Original: FnCallSRadix = js.native
  @JSName("queueMicrotask")
  var queueMicrotask_Original: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
  var undefined: js.UndefOr[scala.Nothing] = js.native
  var v8debug: js.UndefOr[js.Any] = js.native
  def Array(): js.Array[_] = js.native
  def Array(arrayLength: Double): js.Array[_] = js.native
  def Array[T](items: T*): js.Array[T] = js.native
  @JSName("Array")
  def Array_T[T](arrayLength: Double): js.Array[T] = js.native
  def Boolean[T](): scala.Boolean = js.native
  def Boolean[T](value: T): scala.Boolean = js.native
  def Date(): String = js.native
  def Error(): js.Error = js.native
  def Error(message: String): js.Error = js.native
  def EvalError(): js.Error = js.native
  def EvalError(message: String): js.Error = js.native
  @JSName("EvalError")
  def EvalError_EvalError(): js.EvalError = js.native
  @JSName("EvalError")
  def EvalError_EvalError(message: String): js.EvalError = js.native
  def Function(args: String*): js.Function = js.native
  def Number(): Double = js.native
  def Number(value: js.Any): Double = js.native
  def Object(): js.Any = js.native
  def Object(value: js.Any): js.Any = js.native
  def RangeError(): js.Error = js.native
  def RangeError(message: String): js.Error = js.native
  @JSName("RangeError")
  def RangeError_RangeError(): js.RangeError = js.native
  @JSName("RangeError")
  def RangeError_RangeError(message: String): js.RangeError = js.native
  def ReferenceError(): js.Error = js.native
  def ReferenceError(message: String): js.Error = js.native
  @JSName("ReferenceError")
  def ReferenceError_ReferenceError(): js.ReferenceError = js.native
  @JSName("ReferenceError")
  def ReferenceError_ReferenceError(message: String): js.ReferenceError = js.native
  def RegExp(pattern: js.RegExp): js.RegExp = js.native
  def RegExp(pattern: String): js.RegExp = js.native
  def RegExp(pattern: String, flags: String): js.RegExp = js.native
  def String(): java.lang.String = js.native
  def String(value: js.Any): java.lang.String = js.native
  def SyntaxError(): js.Error = js.native
  def SyntaxError(message: String): js.Error = js.native
  @JSName("SyntaxError")
  def SyntaxError_SyntaxError(): js.SyntaxError = js.native
  @JSName("SyntaxError")
  def SyntaxError_SyntaxError(message: String): js.SyntaxError = js.native
  def TypeError(): js.Error = js.native
  def TypeError(message: String): js.Error = js.native
  @JSName("TypeError")
  def TypeError_TypeError(): js.TypeError = js.native
  @JSName("TypeError")
  def TypeError_TypeError(message: String): js.TypeError = js.native
  def URIError(): js.Error = js.native
  def URIError(message: String): js.Error = js.native
  @JSName("URIError")
  def URIError_URIError(): js.URIError = js.native
  @JSName("URIError")
  def URIError_URIError(message: String): js.URIError = js.native
  def clearImmediate(immediateId: Immediate): Unit = js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  def decodeURI(encodedURI: String): String = js.native
  def decodeURIComponent(encodedURIComponent: String): String = js.native
  def encodeURI(uri: String): String = js.native
  def encodeURIComponent(uriComponent: String): String = js.native
  def encodeURIComponent(uriComponent: scala.Boolean): String = js.native
  def encodeURIComponent(uriComponent: Double): String = js.native
  def escape(str: String): String = js.native
  def eval(x: String): js.Any = js.native
  def gc(): Unit = js.native
  def isFinite(number: Double): scala.Boolean = js.native
  def isNaN(number: Double): scala.Boolean = js.native
  def parseFloat(string: String): Double = js.native
  def parseInt(s: String): Double = js.native
  def parseInt(s: String, radix: Double): Double = js.native
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def unescape(str: String): String = js.native
}

