
// Created by ZG on 15/7/9.
// 

object Sum {
  def main(args: Array[String]) {
    val v = Vector(1,10,100,1000)
    var sum = 0
    v.foreach(x => sum+=x)
    println("sum = " + sum)
  }
}
