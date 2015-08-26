package CookCode.TestStrings

// Created by ZG on 15/7/28.
// 

object ProcessingAStringOneCharacterAtATime extends App{

  val upper = "hello, world".map(c => c.toUpper)
  println("upper = " + upper)

  val upper1 = "hello, world".map(_.toUpper)
  println("upper1 = " + upper1)

  val upper2 = "hello, world".filter(_ != 'l').map(_.toUpper)
  println("upper2 = " + upper2)

  for (c <- "hello") println(c)

  val upper3 = for (c <- "hello, world") yield c.toUpper
  println("upper3 = " + upper3)

  val result = for {
    c <- "hello, world"
    if c != 'l'
  } yield c.toUpper
  println("result = " + result)

  def toLower(c: Char): Char = (c.toByte+32).toChar

  val lower = "HELLO".map(toLower)
  println("lower = " + lower)

  val lower1 = for (c <- "HELLO") yield toLower(c)
  println(lower1)

}
