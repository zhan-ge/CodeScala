
// Created by ZG on 15/7/6.
// 

object Animals {
  def main(args: Array[String]) {

    // create some objects
    val g1 = new Griaffe
    val g2 = new Griaffe
    val b1 = new Bear
    val h1 = new Hippo

    println("g1 = " + g1)
    println("g2 = " + g2)
    println("b1 = " + b1)
    println("h1 = " + h1)

    val he1 = new Hyena
    println("he1 = " + he1)

    val dog1 = new Dog
    println("dog1 = " + dog1)
    println("dog1.bark() = " + dog1.bark())

    val ran = new ImportClass

  }

}

// create some classes
class Griaffe
class Bear
class Hippo