import ammonite.ops._

implicit val wd = os.pwd

val versions = Seq(
//  "1.8.0",
//  "2.0.0",
//  "2.1.1",
//  "2.2.0",
//  "2.3.0",
//  "2.4.0",
//  "2.5.0",
//  "2.6.1",
//  "2.7.1",
//  "2.8.1",
//  "2.9.1",
//  "3.0.1",
//  "3.1.1",
//  "3.2.1",
//  "3.3.1",
//  "3.4.1",
//  "3.5.1",
  "3.6.2",
  "3.7.2",
  "3.8.2",
  "3.9.2",
)

versions.foreach {v =>
  %.extend(Nil, Map("TS_VERSION" -> v))("sbt", "clean", "stImport")
  %git("add", "-A")
  %git("commit", "-m", s"version ${v}")
}
