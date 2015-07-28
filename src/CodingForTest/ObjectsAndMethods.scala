
// Created by ZG on 15/7/11.
// 

object ObjectsAndMethods {
  def main(args: Array[String]) {
    val x1 = new X(1)
    val x2 = new X(2)
    println("x1.f = " + x1.f)
    println("x2.f = " + x2.f)
  }
}

class X(val n:Int){
  def f = n * 20
}