package CookCode.ControlStructures

// Created by ZG on 15/8/2.
// 三元运算符

object UsingTheIfConstructLikeTernaryOperator extends App{

//  val absValue = if (a < 0) -a else a

//  println(if (i == 0) "a" else "b")

//  hash = hash * prime + (if (name == null) 0 else name.hashCode)

  def abs(x:Int) = if(x>=0) x else -x
  def max(a:Int, b:Int) = if(a>b) a else b
}
