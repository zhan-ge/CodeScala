
// Created by ZG on 15/7/8.
// 

object TDDFail {
  def main(args: Array[String]) {
    calculateBMI(160, 68)
    calculateBMI(100, 68)
    calculateBMI(200, 68)

  }
  def calculateBMI(lbs:Int, height:Int): String = { "Normal weight" }

}
