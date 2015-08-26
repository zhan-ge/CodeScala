package CookCode.ControlStructures

// Created by ZG on 15/7/31.
// 

object UsingforLoopswithMultipleCounters extends App{

  for (i <- 1 to 2; j <- 1 to 2) println(s"i = $i, j = $j")

  for {
    i <- 1 to 3
    j <- 1 to 5
    k <- 1 to 10
  } println(s"i = $i, j = $j, k = $k")

  // create a small two-dimensional array
  val array = Array.ofDim[Int](2,2)
  for {
    i <- 0 to 1
    j <- 0 to 1
  } println(s"($i)($j) = ${array(i)(j)}")

}
