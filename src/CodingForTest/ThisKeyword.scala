
// Created by ZG on 15/7/11.
// 

object ThisKeyword {
  def main(args: Array[String]) {
    val x1 = new X1(1)
    val x2 = new X1(2)
    println("x1.f = " + x1.f)
    println("X2.F = " + x2.f)
  }
}

class X1(val n: Int){
  def f = this.n * 10
}