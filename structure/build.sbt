scalaVersion := "2.13.6"

version := "1.0"

libraryDependencies ++= Dependencies.All

lazy val root = project
  .enablePlugins(JUnitXmlReportPlugin)
  .in(file("."))
  .settings(name := "App Structure")
  .aggregate(app, domain)

lazy val app = project
  .dependsOn(domain)

lazy val domain = project

/*














// boot, application
lazy val app = project
  .aggregate(user, group, permission, casino)
  // .dependsOn(user, group, permission, casino)
  // .dependsOn(user, casino)

lazy val user = project

lazy val group = project

lazy val permission = project

lazy val casino = project

// common
// assignment
 */