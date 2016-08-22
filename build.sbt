lazy val root = (project in file(".")).
  aggregate(app).
  settings(inThisBuild(List(
      organization := "com.example",
      scalaVersion := "$scala_version$"
    )),
    name := "$name$-root"
  )

lazy val app = (project in file("app")),
  settings(
    name := "$name$"
  )
