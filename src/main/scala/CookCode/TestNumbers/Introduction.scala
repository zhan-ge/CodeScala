package CookCode.TestNumbers

// Created by ZG on 15/7/30.
// 

object Introduction extends App{

  println("Short.MinValue = " + Short.MinValue)
  println("Short.MaxValue = " + Short.MaxValue)

  println("Int.MinValue = " + Int.MinValue)
  println("Int.MaxValue = " + Int.MaxValue)

  val hun = "100"
  println("hun.toInt = " + hun.toInt)
  println("hun.toDouble = " + hun.toDouble)
  println("hun.toFloat = " + hun.toFloat)
  println("hun.toLong = " + hun.toLong)

  println("Integer.parseInt = " + Integer.parseInt("10", 8))

  def ~=(x: Double, y: Double, precision: Double) = {
    if ((x - y).abs < precision) true else false
  }
  val a = 0.3
  val b = 0.1 + 0.2     // b = 0.30000000000000004
  println("b = " + b)

  println(~=(a, b, 0.0001))
  println(~=(b, a, 0.0001))

}
