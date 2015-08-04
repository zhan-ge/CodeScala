package CookCode.Traits

// Created by ZG on 15/8/4.
// 

object UsingTraitLikeanAbstractClass {

}

trait Pet {
  def speak() { println("Yo") }   // concrete implementation
  def comeToMaster()              // abstract method
}

//class Dog extends Pet {
//  // don't need to implement 'speak' if you don't need to
//  def comeToMaster() {"I'm coming!"}
//}

class Cat extends Pet {
  // override the speak method
  override def speak() { "meow" }   // 重写父类或特质的已实现方法时，使用override
  def comeToMaster() { "That's not gonna happen." }
}