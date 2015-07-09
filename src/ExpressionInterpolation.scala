
// Created by ZG on 15/7/9.
// 

object ExpressionInterpolation {
  def main(args: Array[String]) {

    println("f(7) = " + s"${f(7)}")
    
  }

  def f(n:Int):Int = { n * 11 }
  
}

