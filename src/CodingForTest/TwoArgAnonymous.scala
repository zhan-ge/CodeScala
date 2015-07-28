
// Created by ZG on 15/7/9.
// 

object TwoArgAnonymous {
  def main(args: Array[String]) {
    val v = Vector(19 ,1,7,3,2,14)
    println("v.sorted = " + v.sorted)
    println("v.sortWith(i,j) = " + v.sortWith((i,j) => j<i))
  }
}
