package CookCode.TestStrings

// Created by ZG on 15/7/28.
// 

object SplittingStrings extends App{

  val sp1 = "hello world".split(" ")
  println(sp1.getClass.getName)

  // The split method returns an array of String elements, which you can then treat as a normal Scala Array:

  sp1.foreach(println)
  println(sp1.toList)

  val sp2 = "eggs, milk, butter, Coco Puffs"
  sp2.split(",").foreach(println)
  sp2.split(",").map(_.trim).foreach(println)   // remove the white space, like strip()
  sp2.split("\\s+").foreach(println)            // split with white space
  sp2.split(' ').foreach(println)               // split with white space of a char, as same as with string
}
