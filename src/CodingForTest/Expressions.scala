
// Created by ZG on 15/7/5.
// 

object Expressions {
  def main(args: Array[String]) {
    val c = {
      val i1 = 2
      val j1 = 4/i1
      i1*j1           // the last's line is the value of expression.
    }
    println("c = " + c)
  }
}
