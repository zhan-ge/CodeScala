
// Created by ZG on 15/7/11.
// 

object ObjectField {
  def main(args: Array[String]) {
    val a = new X3
    val b = new X3
    println("a.increment() = " + a.increment())
    println("b.increment() = " + b.increment())
    println("a.increment() = " + a.increment())
  }
}

class X3{
  def increment() = {
    X3.n += 1
    X3.n
  }
}

object X3{
  var n:Int = 0
}