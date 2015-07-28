
// Created by ZG on 15/7/9.
// 

object Brevity1 {
  def main(args: Array[String]) {

    val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
    println("filterWithYield1(v) = " + filterWithYield1(v))
    println("filterWithYield2(v) = " + filterWithYield2(v))
    println("filterWithYield3(v) = " + filterWithYield3(v))
    println("filterWithYield4(v) = " + filterWithYield4(v))

    "OttoBoughtAnAuto".foreach(c => print(c))
    println()
    "OttoBoughtAnAuto".foreach(print(_))
    println()
    "OttoBoughtAnAuto".foreach(print)
    println()

    println("explicitReturnType() = " + explicitReturnType())
    println("inferredReturnType = " + inferredReturnType)

  }

  def filterWithYield1(v:Vector[Int]):Vector[Int] = {
    val result = for {
      n <- v
      if n < 10
      if n % 2 != 0
    } yield n
    result
  }

  def filterWithYield2(v:Vector[Int]):Vector[Int] = {
    for {
      n <- v
      if n < 10
      if n % 2 != 0
    } yield n
  }

  def filterWithYield3(v:Vector[Int]):Vector[Int] =
    for {
      n <- v
      if n < 10
      if n % 2 != 0
    } yield n

  def filterWithYield4(v:Vector[Int]):Vector[Int] =
    for {n <- v; if n < 10; if n % 2 != 0}
      yield n

  def explicitReturnType():Vector[Int] = {
    Vector(11, 22, 99, 34)
  }

  def inferredReturnType() =
    Vector(11, 22, 99, 34)


}
