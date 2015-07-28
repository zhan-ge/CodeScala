package CookCode.TestStrings

// Created by ZG on 15/7/28.
// 

object SubstitutingVariablesIntoStrings extends App{

  val name = "Fred"
  val age = 33
  val weight = 200.00
  println(s"$name is $age years old, and weighs $weight pounds.")         // s method
  println(f"$name is $age years old, and weighs $weight%.2f pounds.")     // f method
  println(f"$name is $age years old, and weighs $weight%.0f pounds.")
  println("%s is %d years old, and weighs %.2f pounds.".format(name, age, weight))

  println(s"Age next year: ${age + 1}")

  println(s"You are 33 years old: ${age == 33}")

  case class Student(name: String, score: Int)
  val hannah = Student("Hannah", 95)
  println(s"${hannah.name} has a score of ${hannah.score}")

  println(s"foo\nbar")
  println(raw"foo\nbar")

}
