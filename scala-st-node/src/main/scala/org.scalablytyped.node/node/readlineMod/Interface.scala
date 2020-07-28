package org.scalablytyped.node.node.readlineMod

import org.scalablytyped.node.node.Buffer
import org.scalablytyped.node.node.NodeJS.ReadableStream
import org.scalablytyped.node.node.NodeJS.WritableStream
import org.scalablytyped.node.node.eventsMod.EventEmitter
import org.scalablytyped.node.node.nodeStrings.SIGCONT
import org.scalablytyped.node.node.nodeStrings.SIGINT
import org.scalablytyped.node.node.nodeStrings.SIGTSTP
import org.scalablytyped.node.node.nodeStrings.close
import org.scalablytyped.node.node.nodeStrings.pause
import org.scalablytyped.node.node.nodeStrings.resume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readline", "Interface")
@js.native
class Interface protected () extends EventEmitter {
  /**
    * NOTE: According to the documentation:
    *
    * > Instances of the `readline.Interface` class are constructed using the
    * > `readline.createInterface()` method.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
    */
  protected def this(input: ReadableStream) = this()
  /**
    * NOTE: According to the documentation:
    *
    * > Instances of the `readline.Interface` class are constructed using the
    * > `readline.createInterface()` method.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
    */
  protected def this(options: ReadLineOptions) = this()
  protected def this(input: ReadableStream, output: WritableStream) = this()
  protected def this(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: AsyncCompleter) = this()
  protected def this(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer) = this()
  protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
  protected def this(input: ReadableStream, output: WritableStream, completer: Completer) = this()
  protected def this(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: js.UndefOr[scala.Nothing],
    terminal: Boolean
  ) = this()
  protected def this(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: AsyncCompleter,
    terminal: Boolean
  ) = this()
  protected def this(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer, terminal: Boolean) = this()
  protected def this(
    input: ReadableStream,
    output: WritableStream,
    completer: js.UndefOr[scala.Nothing],
    terminal: Boolean
  ) = this()
  protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
  protected def this(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean) = this()
  /** The current cursor position in the input line */
  val cursor: Double = js.native
  // Need direct access to line/cursor data, for use in external processes
  // see: https://github.com/nodejs/node/issues/30347
  /** The current input data */
  val line: String = js.native
  val terminal: Boolean = js.native
  @JSName("addListener")
  def addListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_line(
    event: org.scalablytyped.node.node.nodeStrings.line,
    listener: js.Function1[/* input */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  def close(): Unit = js.native
  @JSName("emit")
  def emit_SIGCONT(event: SIGCONT): Boolean = js.native
  @JSName("emit")
  def emit_SIGINT(event: SIGINT): Boolean = js.native
  @JSName("emit")
  def emit_SIGTSTP(event: SIGTSTP): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_line(event: org.scalablytyped.node.node.nodeStrings.line, input: String): Boolean = js.native
  @JSName("emit")
  def emit_pause(event: pause): Boolean = js.native
  @JSName("emit")
  def emit_resume(event: resume): Boolean = js.native
  /**
    * Returns the real position of the cursor in relation to the input
    * prompt + string.  Long input (wrapping) strings, as well as multiple
    * line prompts are included in the calculations.
    */
  def getCursorPos(): CursorPos = js.native
  @JSName("on")
  def on_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_line(
    event: org.scalablytyped.node.node.nodeStrings.line,
    listener: js.Function1[/* input */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_line(
    event: org.scalablytyped.node.node.nodeStrings.line,
    listener: js.Function1[/* input */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  def pause(): this.type = js.native
  @JSName("prependListener")
  def prependListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_line(
    event: org.scalablytyped.node.node.nodeStrings.line,
    listener: js.Function1[/* input */ String, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_line(
    event: org.scalablytyped.node.node.nodeStrings.line,
    listener: js.Function1[/* input */ String, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  def prompt(): Unit = js.native
  def prompt(preserveCursor: Boolean): Unit = js.native
  def question(query: String, callback: js.Function1[/* answer */ String, Unit]): Unit = js.native
  def resume(): this.type = js.native
  def setPrompt(prompt: String): Unit = js.native
  def write(data: Buffer): Unit = js.native
  def write(data: Buffer, key: Key): Unit = js.native
  def write(data: String): Unit = js.native
  def write(data: String, key: Key): Unit = js.native
}

