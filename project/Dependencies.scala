
import sbt._

object Version {
  val slick = "2.1.0-RC3"
  val jasper = "5.6.1"
  val spray = "1.3.1"
  val scalaVersion = "2.11.4"
}

object Library {
  val mail = "com.sun.mail" % "javax.mail" % "1.4.5"
}

object Dependencies {

  import Library._

  val commenDeps = Seq(
    mail
  )
}