
// Created by ZG on 15/7/5.
// 

object AddMultiply {
  def main(args: Array[String]) {
    val r:Double = addMultiply(7, 9, "Inside addMultiply.")
    println("r = " + r)

    test(7, 9, "Inside addMultiply.", 33.6)
  }

  def addMultiply(x:Int, y:Double, s:String) :Double = {
    println("s = " + s)
    (x + y) * 2.1
  }

  def test(x:Int, y:Double, s:String, expected:Double): Unit = {
    val result = addMultiply(x, y, s)
    assert(result == expected,
      "Expected " + expected + " Got " + result)
    println("result = " + result)
  }

}
