
// Created by ZG on 15/7/5.
// 

object Types {
  def main(args: Array[String]) {

    val whole:Int = 11
    val fractional:Double = 1.4

    // true or false
    val trueOrFalse:Boolean = true
    val words:String = "A value"
    val lines:String =
      """
        Triple quotes let
        you have many lines
        in your string.
      """
    println("whole = " + whole)
    println("fractional = " + fractional)
    println("trueOrFalse = " + trueOrFalse)
    println("words = " + words)
    println("lines = " + lines)

  }
}
