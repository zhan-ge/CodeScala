package CookCode.TestStrings

// Created by ZG on 15/7/29.
// 

object FindingPatternsInStrings extends App{

  val numPattern = "[0-9]+".r

  val address = "123 Main Street Suite 101"

  val match1 = numPattern.findFirstIn(address)
  println(match1)

  match1.foreach{ e =>
    println(s"Found match $e.")
  }

  val matches = numPattern.findAllIn(address).toArray
  matches.foreach(println)

  val address1 = "Main Street Suite"

  val result = numPattern.findFirstIn(address1).getOrElse("no match")
  println(result)

}
