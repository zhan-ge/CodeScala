package CookCode.TestStrings

// Created by ZG on 15/7/29.
// 

object ExtractingPartsOfAStringThatMatchPatterns extends App{

  val pattern = "([0-9]+) ([A-Za-z]+)".r

  val pattern(count, fruit) = "100 Bananas"
  println("count, fruit = " + count, fruit)

}
