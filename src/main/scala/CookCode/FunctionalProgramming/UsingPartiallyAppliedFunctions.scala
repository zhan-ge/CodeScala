package CookCode.FunctionalProgramming

// Created by ZG on 15/8/4.
// 

object UsingPartiallyAppliedFunctions extends App{

  val sum = (a: Int, b: Int, c: Int) => a + b + c
  val f = sum(1, 2, _: Int)
  println(f(3))       // 6

}
