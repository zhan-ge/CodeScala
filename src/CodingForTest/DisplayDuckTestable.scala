
// Created by ZG on 15/7/9.
// 

object DisplayDuckTestable {
  def main(args: Array[String]) {
    var s = ""
    val duck = "Duck".toVector
    duck.foreach(n => s += n + ":")
    println("s = " + s)
  }
}
