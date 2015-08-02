package CookCode.ControlStructures

// Created by ZG on 15/8/2.
// 

object MatchingOneMoreExceptions extends App{

  val s = "Foo"
  try {
    val i = s.toInt }
  catch {
    case t: Throwable =>
      t.printStackTrace()
      println("exception ignored")
  }
  println("runnable")

}
