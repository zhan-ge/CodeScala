name := "CodeScala"

version := "1.0"

scalaVersion := "2.11.7"
scalaVersion in ThisBuild := "2.11.7"
logLevel := sbt.Level.Debug

scalacOptions := Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Spray Repository"    at "http://repo.spray.io")
resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

libraryDependencies ++= {
  val akkaV = "2.3.9"
  val sprayV = "1.3.3"
  Seq(
    // spray
    "io.spray"            %%  "spray-can"     % sprayV,
    "io.spray"            %%  "spray-routing" % sprayV,
    "io.spray"            %%  "spray-client"  % sprayV,
    "io.spray"            %%  "spray-httpx"   % sprayV,
    "io.spray"            %%  "spray-json"    % "1.3.2",

    // akka
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,

    // test
    "io.spray"            %%  "spray-testkit" % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "junit"               %   "junit"         % "4.12",
    "com.novocode"        %   "junit-interface"% "0.9",
    "org.scalatest"       %   "scalatest_2.11"% "2.2.4",

    // log
    "com.typesafe.akka"   %%  "akka-slf4j"      % akkaV,
    "ch.qos.logback"      %  "logback-classic"  % "1.1.2",

    // json
    "org.json4s"          %% "json4s-native"  % "3.2.11",

    // Html parser
    "org.jsoup"           % "jsoup"           % "1.8.3",

    // redis-driver
    "net.debasishg"       %% "redisclient"    % "3.0",

    // mongo-driver
    "org.reactivemongo"   %% "reactivemongo"  % "0.11.4",

    // base64 encode/decode
    "commons-codec"       % "commons-codec"   % "1.10",

    // NLP
    "edu.stanford.nlp"    % "stanford-corenlp" % "3.5.2",

    // HtmlUnit
    "net.sourceforge.htmlunit" % "htmlunit"   % "2.18",

    // Selenium-htmlunit-driver
    "org.seleniumhq.selenium" % "selenium-htmlunit-driver" % "2.47.1",

    // httpclient
    "org.apache.httpcomponents" % "httpclient" % "4.5"
  )
}

Revolver.settings.settings

//assemblyMergeStrategy in assembly := {
//  case PathList("org", "ansj", xs @ _*)                 => MergeStrategy.first
//  case PathList("org", "apache", xs @ _*)                 => MergeStrategy.first
//  case PathList("org", "nlpcn", xs @ _*)                 => MergeStrategy.first
//  case PathList("org", "w3c", xs @ _*)                 => MergeStrategy.first
//  case PathList("org", "xml", xs @ _*)                 => MergeStrategy.first
//  case PathList("javax", "xml", xs @ _*)                 => MergeStrategy.first
//  case PathList("edu", "stanford", xs @ _*)                 => MergeStrategy.first
//  case PathList(ps @ _*) if ps.last endsWith ".dic"   => MergeStrategy.first
//  case PathList(ps @ _*) if ps.last endsWith ".data"  => MergeStrategy.first
//  //  case "application.conf"                            => MergeStrategy.concat
//  //  case "unwanted.txt"                                => MergeStrategy.discard
//  case x =>
//    val oldStrategy = (assemblyMergeStrategy in assembly).value
//    oldStrategy(x)
//}