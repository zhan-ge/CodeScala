package CookCode.ClassesAndProperties

// Created by ZG on 15/8/2.
// 定义一个抽象基类或特质，以便在所有子类中引用其属性

object DefiningPropertiesinanAbstractBaseClassorTrait extends App{

  val dog = new Dog("Fido")
  val cat = new Cat("Morris")

  dog.sayHello()
  cat.sayHello()
  println(dog)
  println(cat)

  // verify that the age can be changed
  cat.age = 10
  println(cat)

}

abstract class Pet (name: String) {
  val greeting: String                  // 抽象字段
  var age: Int                          // 抽象字段
  def sayHello() { println(greeting) }
  override def toString = s"I say $greeting, and I'm $age"
}

// 在非抽象子类中必须实现greeting和age
class Dog (name: String) extends Pet (name) {
  val greeting = "Woof"
  var age = 2
}

class Cat (name: String) extends Pet (name) {
  val greeting = "Meow"
  var age = 5
}