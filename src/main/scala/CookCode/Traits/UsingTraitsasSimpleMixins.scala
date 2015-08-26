package CookCode.Traits

// Created by ZG on 15/8/4.
// 实现mixin： 在trait中定义方法，使用with将trait添加到class

object UsingTraitsasSimpleMixins extends App{

  val zeus = new Dog1("Zeus")
  zeus.ownerIsHome()
  zeus.jumpForJoy()

}

trait Tail {
  def wagTail() { println("tail is wagging") }
  def stopTail() { println("tail is stopped") }
}

abstract class Pet1 (var name: String) {
  def speak()       // abstract method
  def ownerIsHome() { println("excited") }
  def jumpForJoy() { println("jumping for joy") }
}

class Dog1 (name: String) extends Pet1(name) with Tail {
  def speak() { println("woof") }
  override def ownerIsHome() {
    wagTail()
    speak()
  }
}