package CookCode.ControlStructures

// Created by ZG on 15/7/31.
// 

object LoopingWithForAndForeach extends App{

  val a = Array("apple", "banana", "orange")
  for (e <- a) println(s"->$e")

  // Returning values from a for loop
  val newArray = for (e <- a) yield e.toUpperCase
  newArray.foreach(println)

  // for loop counters
  for (i <- a.indices) {        // for (i <- 0 until a.length)
    println(s"$i is ${a(i)}")
  }

  for ((e, count) <- a.zipWithIndex){
    println(s"$count is $e")
  }

  for (i <- 1 to 3) println(i)

  for (i <- 1 to 10 if i < 4) println(i)

  val names = Map("fname" -> "Robert", "lname" -> "Goren")
  for ((k,v) <- names) println(s"key: $k, value: $v")

  a.foreach(println)
  a.foreach(e => println(e.toUpperCase))

  for {
    i <- 1 to 10
    if i % 2 == 0
  } println(i)

}
