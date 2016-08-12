lazy val root = (project in file(".")).
  aggregate(app).
  settings(inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8"
    ))
  )

lazy val app = (project in file("app"))
