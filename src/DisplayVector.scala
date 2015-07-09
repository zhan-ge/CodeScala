
// Created by ZG on 15/7/9.
// 

object DisplayVector {
  def main(args: Array[String]) {

    val v = Vector(1,2,3,4)
    v.foreach(show)

  }

  def show(n:Int):Unit = { println("> " + n)}

}
