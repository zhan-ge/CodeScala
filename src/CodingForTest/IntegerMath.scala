
// Created by ZG on 15/7/1.
// 

object IntegerMath {
  def main(args: Array[String]) {

    val lbs = 160
    val height = 68

    val bmi = lbs/(height * height) * 703.07

    if (bmi < 18.5){
      println("Under weight")
    } else if(bmi < 25){
      println("Normal weight")
    } else {
      println("Over weight")
    }

  }
}
