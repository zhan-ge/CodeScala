
// Created by ZG on 15/7/9.
// 

object Comprehension {
  def main(args: Array[String]) {
    val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
    println("evenGT5(v) = " + evenGT5(v))
  }

  def evenGT5(v:Vector[Int]):Vector[Int] = {
    // 'var' so we can reassign 'result':
    var result = Vector[Int]()
    for {
      n <- v
      if n > 5
      if n % 2 ==0
    } result = result :+ n
    result
  }

}
