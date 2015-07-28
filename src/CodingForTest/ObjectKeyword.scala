
// Created by ZG on 15/7/11.
// 

object ObjectKeyword {
  def main(args: Array[String]) {
    println("X2.n = " + X2.n)
    println("X2.f = " + X2.f)
    println("X2.g = " + X2.g)
  }

}

object X2{
  val n = 2
  def f = n* 10
  def g = this.n * 20
}