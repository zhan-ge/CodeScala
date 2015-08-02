package CookCode.ControlStructures

// Created by ZG on 15/8/2.
// 

object UsingMatchExpressionInsteadisInstanceOf extends App{

  // if (x.isInstanceOf[Foo]) { do something ...
  def isPerson(x: Any): Boolean =
    x match {
      case p: Person => true
      case _ => false
    }

  trait SentientBeing
  case class Person(name: String, age: Int) extends SentientBeing

  trait Animal extends SentientBeing
  case class Dog(name: String) extends Animal

  // later in the code ...
  def printInfo(x: SentientBeing) =
    x match {
      case Person(name, age) => // handle the Person
      case Dog(name) => // handle the Dog
  }


}
