
// Created by ZG on 15/7/9.
// 

object Yielding {
  def main(args: Array[String]) {
    val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
    println("yielding(v) = " + yielding(v))
    println("yielding2(v) = " + yielding2(v))
    println("yielding3(v) = " + yielding3(v))
    println("yielding4(v) = " + yielding4(v))
  }

  def yielding(v:Vector[Int]):Vector[Int] = {
    val result = for {
      n <- v
      if n < 10
      if n % 2 == 0
    }yield n
    result
  }

  def yielding2(v:Vector[Int]):Vector[Int] = {
    for{
      n <- v
      if n < 10
      isOdd = n % 2 != 0
      if isOdd
    }yield n
  }

  def yielding3(v: Vector[Int]):Vector[Int] = {
    for{
      n <- v
      if n < 10
      isOdd = n % 2 != 0
      if isOdd
    }yield{
      val u = n * 10
      u + 2
    }
  }

  def yielding4(v: Vector[Int]) = {
    for{
      n <- v
      if n < 10
      isOdd = n % 2 != 0
      if isOdd
    }yield{
      for(u <- Range(0, n))
        yield u
    }
  }

}
