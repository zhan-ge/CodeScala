package CookCode.TestStrings

// Created by ZG on 15/7/29.
// 

object ReplacingPatternsInStrings extends App{

  val address = "123 Main Street"       // must assign the result to a new variable
  val addressWithOutNum = address.replaceAll("[0-9]", "x")
  println("addressWithOutNum = " + addressWithOutNum)

  val regex = "[0-9]".r
  val newAddress = regex.replaceAllIn("123 Main Street", "x")
  println("newAddress = " + newAddress)

  // To replace only the first occurrence of a pattern
  val result = "123".replaceFirst("[0-9]", "x")
  println("result = " + result)

  val regexH = "H".r
  val resultReplaceH = regexH.replaceFirstIn("Hello world", "J")
  println("resultReplaceH = " + resultReplaceH)

}
