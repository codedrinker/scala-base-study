import sbt._

object Build extends Build {
  val mainName = "scala-base-study"

  lazy val official = Project("official", file("official")).settings(Keys.libraryDependencies ++= Dependencies.commenDeps)

  lazy val deepin = Project("deepin", file("deepin")).settings(Keys.libraryDependencies ++= Dependencies.commenDeps)

  lazy val danielwestheide = Project("danielwestheide", file("danielwestheide")).settings(Keys.libraryDependencies ++= Dependencies.commenDeps)

  val main = Project(mainName, file(".")).dependsOn(deepin, official, danielwestheide)
}