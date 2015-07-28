
// Created by ZG on 15/7/8.
// 

object ClassArg {
  def main(args: Array[String]) {
    val an = new ClassArg(10)
    an.f
  }
}


class ClassArg(a:Int){
  println("f = " + f)

  def f:Int = { a * 10}
}