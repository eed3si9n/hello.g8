lazy val root = (project in file(".")).
  aggregate(app).
  settings(inThisBuild(List(
      organization := "com.example",
      scalaVersion := "$scala_version$"
    ))
  )

lazy val app = (project in file("app"))
