
// Created by ZG on 15/7/9.
// 

object StringInterpolation {
  def main(args: Array[String]) {
    println("i(\"hi\", 11, 3.14) = " + i("hi", 11, 3.14))
  }

  def i(s:String, n:Int, d:Double):String = {
    s"first: $s, second: $n, third: $d"
  }

}
