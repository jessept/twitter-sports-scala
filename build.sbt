name := "twitter-sports-scala"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.0.1"
libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "2.0.0"
libraryDependencies += "com.google.code.gson" % "gson" % "2.7"
libraryDependencies += "org.apache.spark" % "spark-streaming-twitter_2.11" % "1.6.2"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.0.0"
libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.5"