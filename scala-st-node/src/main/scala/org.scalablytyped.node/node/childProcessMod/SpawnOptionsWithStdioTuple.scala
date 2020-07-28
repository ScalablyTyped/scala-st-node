package org.scalablytyped.node.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnOptionsWithStdioTuple[Stdin /* <: StdioNull | StdioPipe */, Stdout /* <: StdioNull | StdioPipe */, Stderr /* <: StdioNull | StdioPipe */] extends SpawnOptions {
  @JSName("stdio")
  var stdio_SpawnOptionsWithStdioTuple: js.Tuple3[Stdin, Stdout, Stderr]
}

object SpawnOptionsWithStdioTuple {
  @scala.inline
  def apply[/* <: `org.scalablytyped.node`.node.childProcessMod.StdioNull | `org.scalablytyped.node`.node.childProcessMod.StdioPipe */ Stdin, /* <: `org.scalablytyped.node`.node.childProcessMod.StdioNull | `org.scalablytyped.node`.node.childProcessMod.StdioPipe */ Stdout, /* <: `org.scalablytyped.node`.node.childProcessMod.StdioNull | `org.scalablytyped.node`.node.childProcessMod.StdioPipe */ Stderr](stdio: js.Tuple3[Stdin, Stdout, Stderr]): SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr] = {
    val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr]]
  }
  @scala.inline
  implicit class SpawnOptionsWithStdioTupleOps[Self <: SpawnOptionsWithStdioTuple[_, _, _], /* <: `org.scalablytyped.node`.node.childProcessMod.StdioNull | `org.scalablytyped.node`.node.childProcessMod.StdioPipe */ Stdin, /* <: `org.scalablytyped.node`.node.childProcessMod.StdioNull | `org.scalablytyped.node`.node.childProcessMod.StdioPipe */ Stdout, /* <: `org.scalablytyped.node`.node.childProcessMod.StdioNull | `org.scalablytyped.node`.node.childProcessMod.StdioPipe */ Stderr] (val x: Self with (SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr])) extends AnyVal {
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
    def setStdio(value: js.Tuple3[Stdin, Stdout, Stderr]): Self = this.set("stdio", value.asInstanceOf[js.Any])
  }
  
}

