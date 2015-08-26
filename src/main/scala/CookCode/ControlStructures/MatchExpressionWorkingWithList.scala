package CookCode.ControlStructures

// Created by ZG on 15/8/2.
// 

object MatchExpressionWorkingWithList extends App{

  def listToString(list: List[String]): String =
    list match {
      case s :: rest => s + " " + listToString(rest)
      case Nil => ""
  }

  val fruits = "Apples" :: "Bananas" :: "Oranges" :: Nil
  println(listToString(fruits))

  def sum(list: List[Int]): Int =
    list match {
      case Nil => 1
      case n :: rest => n + sum(rest)
  }

  def multiply(list: List[Int]): Int =
    list match {
      case Nil => 1
      case n :: rest => n * multiply(rest)
  }

  val nums = List(1,2,3,4,5)
  println(sum(nums))
  println(multiply(nums))

}
