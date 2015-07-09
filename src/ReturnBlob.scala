
// Created by ZG on 15/7/9.
// 

object ReturnBlob {
  def main(args: Array[String]) {
    println("data(0.2) = " + data(0.2))
    println("data(7.0) = " + data(7.0))
  }

  def data(input:Double) = {
    if (input > 5.0)
      ReturnBlobs(input * 2, "High")
    else
      ReturnBlobs(input * 4, "Low")
  }

}

case class ReturnBlobs(data:Double, info:String)
