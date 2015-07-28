
// Created by ZG on 15/7/9.
// 

object Tuples {
  def main(args: Array[String]) {
    println("data2(1.0) = " + data2(1.0))
    println("data2(8.0) = " + data2(8.0))

    println("data3(1.0) = " + data3(1.0))
    println("data3(9.0) = " + data3(9.0))

  }

  def data2(input:Double):(Double, String) = {
    if (input > 5.0){
      (input * 2, "High")
    }
    else{
      (input * 10, "Low")
    }
  }

  def data3(input:Double) = {
    if (input > 5.0){
      (input * 2, "High")
    }
    else{
      (input * 10, "Low")
    }
  }

}
