
// Created by ZG on 15/7/1.
// 

object BMI {
  def main(args: Array[String]) {
    val kg = 72.57
    val heightM = 1.727

    val bmi = kg/(heightM * heightM)

    if (bmi < 18.5){
      println("Under weight")
    } else if (bmi < 25){
      println("Normal weight")
    } else {
      println("Over weight")
    }
  }
}
