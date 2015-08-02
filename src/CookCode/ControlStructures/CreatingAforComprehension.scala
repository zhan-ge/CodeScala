package CookCode.ControlStructures

// Created by ZG on 15/7/31.
// 

object CreatingAforComprehension extends App{

  val names = Array("chris", "ed", "maurice")
  val capNames = for (e <- names) yield e.capitalize

  var fruits = scala.collection.mutable.ArrayBuffer[String]()
  fruits += "apple"
  fruits += "banana"
  fruits += "orange"
  val out = for (e <- fruits) yield e.toUpperCase         // out would be a ArrayBuffer
  println("out = " + out)

  val fruitsNew = "apple" :: "banana" :: "orange" :: Nil  // List
  val outNew = for (e <- fruits) yield e.toUpperCase      // List

}
