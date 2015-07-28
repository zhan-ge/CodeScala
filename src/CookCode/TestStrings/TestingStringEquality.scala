package CookCode.TestStrings

// Created by ZG on 15/7/28.
// 字符串对比

object TestingStringEquality extends App{

  val str1 = "hello"
  val str2 = "Hello"
  println("str1 = " + str1==str2)
  println("str1 = " + str1.toUpperCase==str2.toUpperCase)

  // calling a method on a null string can throw a NullPointerException
  val str3 = null
  println(str1.equalsIgnoreCase(str3))
  println(str1.equalsIgnoreCase(str2))

}
