
// Created by ZG on 15/7/9.
// 

object Overloading {
  def main(args: Array[String]) {

    val mo1 = new Overloading1
    val mo2 = new Overloading2
    println("mo1.f = " + mo1.f)
    println("mo1.f(11) = " + mo1.f(11))
    println("mo2.f = " + mo2.f)
    println("mo2.f(22) = " + mo2.f(22))

  }
}

class Overloading1 {
  def f:Int = {88}
  def f(n:Int):Int = {n + 2}
}

class Overloading2 {
  def f:Int = {99}
  def f(n:Int) = {n + 1}
}