
// Created by ZG on 15/7/12.
// 

object TestAbstractClasses {
  def main(args: Array[String]) {
    println("(new Duck).templaceMethod = " + (new Duck).templaceMethod)
    println("(new Cow).templaceMethod = " + (new Cow).templaceMethod)
  }
}

abstract class Animal {
  def templaceMethod = s"The $animal goes $sound"
  // Abstract methods (no method body):
  def animal:String
  def sound:String
}

class Duck extends Animal{
  def animal = "Duck"
  // "override" is optional here:
  override def sound = "Quack"
}

class Cow extends Animal {
  def animal = "Cow"
  def sound = "Moo"
}

