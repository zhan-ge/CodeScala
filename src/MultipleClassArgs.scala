
// Created by ZG on 15/7/8.
// 

object MultipleClassArgs {
  def main(args: Array[String]) {
    val sum3 = new Sum3(3,5,7)
    println("sum3.result = " + sum3.result)
  }
}

class Sum3(a1:Int, a2:Int, a3:Int) {
  def result:Int = { a1+a2+a3 }
}
