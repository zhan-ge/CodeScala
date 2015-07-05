
// Created by ZG on 15/7/5.
// 

object MultiplyByTwo {
  def main(args: Array[String]) {
    val r = mutiplyByTwo(5)           // call method
    println("r = " + r)
  }

  def mutiplyByTwo(x:Int) :Int = {
    println("Inside mutiplyByTwo.")
    x * 2                             // return the result
  }

}
