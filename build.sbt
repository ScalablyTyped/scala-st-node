val baseVersion = "1"

// es6 is what you get by default
val `scala-st-node` = project
  .enablePlugins(ScalablyTypedConverterGenSourcePlugin)
  .settings(
    organization := "com.olvind",
    scalaVersion := "2.13.2",
    crossScalaVersions := List("2.12.10", scalaVersion.value),
    version := s"1.0.0-beta22-$baseVersion",
    stOutputPackage := "org.scalablytyped.node",
    stStdlib := List("es5"),
    stUseScalaJsDom := true,
    stSourceGenMode := SourceGenMode.Manual((Compile / scalaSource).value),
    stEnableScalaJsDefined := Selection.All,
    stTypescriptVersion := "3.9.3",
    stMinimize := Selection.NoneExcept("std"),
    Compile / npmDependencies ++= Seq(
      "@types/accept" -> "3.1.1",
      "@types/express" -> "4.17.7",
    ),
    // publication settings
    sources in (Compile, doc) := Seq(), // doc jar huge and not useful
    homepage := Some(new URL("https://github.com/ScalablyTyped/scala-st-node")),
    startYear := Some(2020),
    pomExtra := (
      <scm>
        <connection>scm:git:github.com:/ScalablyTyped/scala-st-node</connection>
        <developerConnection>scm:git:git@github.com:ScalablyTyped/scala-st-node.git</developerConnection>
        <url>github.com:ScalablyTyped/scala-st-node.git</url>
      </scm>
        <developers>
          <developer>
            <id>oyvindberg</id>
            <name>Øyvind Raddum Berg</name>
          </developer>
        </developers>
      ),
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value)
        Some("snapshots" at nexus + "content/repositories/snapshots")
      else
        Some("releases" at nexus + "service/local/staging/deploy/maven2")
    }
  )


lazy val root = project
  .in(file("."))
  .settings(name := "std-root")
  .configure(preventPublication)
  .aggregate(
    `scala-st-node`
//    `scala-st-node-esnext`,
  )

lazy val preventPublication: Project => Project =
  _.settings(
    publish := {},
    publishTo := Some(Resolver.file("Unused transient repository", target.value / "fakepublish")),
    publishArtifact := false,
    publishLocal := {},
    packagedArtifacts := Map.empty,
  ) // doesn't work - https://github.com/sbt/sbt-pgp/issues/42
