package org.scalablytyped.node.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A parsed path object generated by path.parse() or consumed by path.format().
  */
trait ParsedPath extends js.Object {
  /**
    * The file name including extension (if any) such as 'index.html'
    */
  var base: String
  /**
    * The full directory path such as '/home/user/dir' or 'c:\path\dir'
    */
  var dir: String
  /**
    * The file extension (if any) such as '.html'
    */
  var ext: String
  /**
    * The file name without extension (if any) such as 'index'
    */
  var name: String
  /**
    * The root of the path such as '/' or 'c:\'
    */
  var root: String
}

object ParsedPath {
  @scala.inline
  def apply(base: String, dir: String, ext: String, name: String, root: String): ParsedPath = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedPath]
  }
  @scala.inline
  implicit class ParsedPathOps[Self <: ParsedPath] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}
