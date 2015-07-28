
// Created by ZG on 15/7/9.
// 

object ParameterizedTypes {
  def main(args: Array[String]) {

    val v1 = Vector(1,2,3)
    val v2 = Vector("one", "two", "three")

    val p1:Vector[Int] = Vector(1,2,3)
    val p2:Vector[String] = Vector("one", "two", "three")

    println("assert(v1==p1) = " + assert(v1 == p1))
    println("assert(v2==p2) = " + assert(v2 == p2))

  }
}
