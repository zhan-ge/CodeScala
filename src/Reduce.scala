
// Created by ZG on 15/7/9.
// 

object Reduce {
  def main(args: Array[String]) {
    val v = Vector(1,10,100,1000)
    println("v.reduce((sum, n) => sum + n) = " + v.reduce((sum, n) => sum + n))
    println("v.sum = " + v.sum)
  }
}
