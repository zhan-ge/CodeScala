
// Created by ZG on 15/7/8.
// 

object NamedArguments {
  def main(args: Array[String]) {
    val co = new Color(1,2,5)
    val co2 = new Color(1,2,green = 1)
  }
}

class Color(red:Int, blue:Int, green:Int)
