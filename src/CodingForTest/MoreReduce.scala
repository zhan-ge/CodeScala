
// Created by ZG on 15/7/9.
// 

object MoreReduce {
  def main(args: Array[String]) {
    println("(1 to 100).reduce((sum, n) => sum+n) = " + (1 to 100).reduce((sum, n) => sum + n))
    val v = Vector("D", "u", "c", "k", "!")
    println("v.reduce((sum,n)=>sum+n) = " + v.reduce((sum, n) => sum + n))
  }
}
