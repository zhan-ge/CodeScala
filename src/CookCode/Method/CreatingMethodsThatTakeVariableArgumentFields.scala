package CookCode.Method

// Created by ZG on 15/8/3.
// 

object CreatingMethodsThatTakeVariableArgumentFields extends App{

  def printAll(strings: String*) {
    strings.foreach(println)
  }
  printAll()
  printAll("foo")
  printAll("foo", "bar")
  printAll("foo", "bar", "baz")

  val fruits = List("apple", "banana", "cherry")
  printAll(fruits: _*)

}
