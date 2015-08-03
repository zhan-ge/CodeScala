package CookCode.Method

// Created by ZG on 15/8/3.
// 

object CallingMethodOnSuperclass extends App{

  val d = new Dog
  d.walkThenRun()

  val c = new Child
  println(c.hello)
  println(c.printHuman)
  println(c.printFather)
  println(c.printMother)
  println(c.printSuper)
}

class FourLeggedAnimal {
  def walk() { println("I'm walking") }
  def run() { println("I'm running") }
}

class Dog extends FourLeggedAnimal {
  def walkThenRun() {
    super.walk()
    super.run()
    walk()
    run()
  }
}

trait Human {
  def hello = "the Human trait"
}
trait Mother extends Human {
  override def hello = "Mother"
}
trait Father extends Human {
  override def hello = "Father"
}

class Child extends Human with Mother with Father {
  def printSuper = super.hello
  def printMother = super[Mother].hello
  def printFather = super[Father].hello
  def printHuman = super[Human].hello
}