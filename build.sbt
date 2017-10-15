name := "pd"

version := "0.1"

scalaVersion := "2.11.8"

val testVersion = "3.0.1"
val sparkVersion = "2.1.0"

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % testVersion,
  "org.scalatest" %% "scalatest" % testVersion % "test",
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "com.databricks" %% "spark-csv" % "1.5.0"
)
