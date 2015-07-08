
// Created by ZG on 15/7/8.
// 

object VariableClassArgs {
  def main(args: Array[String]) {
    val sum = new Sum(1,23,5,3,5,2,1,1,2)
    println("sum.result = " + sum.result)
  }
}

class Sum(args:Int*){
  def result:Int = {
    var total = 0
    for (x <- args) {
      total += x
    }
    total
  }
}