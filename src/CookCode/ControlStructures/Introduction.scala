package CookCode.ControlStructures

// Created by ZG on 15/7/31.
// 

object Introduction extends App{

//  for {
//    line <- source.getLines
//    char <- line
//    if char.isLetter
//  }
  val nieces = List("emily", "hannah", "mercedes", "porsche")
  val newNices = for (n <- nieces) yield n.capitalize
  println(newNices)

}
