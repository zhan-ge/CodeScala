
// Created by ZG on 15/7/11.
// 

object ObjectMethods {
  def main(args: Array[String]) {
    println("X4.increment() = " + X4.increment())
    println("X4.increment() = " + X4.increment())
    println("X4.count() = " + X4.count())
  }
}


class X4

object X4{
  var n:Int = 0
  def increment() = {n += 1; n}
  def count() = increment()
}