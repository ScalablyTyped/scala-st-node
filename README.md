# scala-st-node
node bindings for Scala.js (powered by ScalablyTyped)

This is an automatic translation of Typescript definitions @typings/node

It is distributed for Scala 2.12 and 2.13 with Scala.js 1

Add this to your `build.sbt`:
```scala
libraryDependencies ++= Seq(
    "com.olvind" %%% "scala-st-node" % "1.0.0-beta22-3.9" 
) 
```

To use this have a look inside `org.scalablytyped.node`, for instance:

```scala
import org.scalablytyped.node.node.pathMod.{^ => path}
println(path.isAbsolute("/"))
````
