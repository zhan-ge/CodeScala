
// Created by ZG on 15/7/8.
// 

object NamedAndDefaultArgs {
  def main(args: Array[String]) {
    val c1 = new Color2(10)
    val c2 = new Color2(20, 20)
    val c3 = new Color2(green = 20, blue = 11)
    val c4 = new Color2(red = 1)
  }
}

class Color2(red:Int=100, blue:Int=100, green:Int=100)
