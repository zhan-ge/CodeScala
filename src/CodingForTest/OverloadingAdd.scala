
// Created by ZG on 15/7/9.
// 

object OverloadingAdd {
  def main(args: Array[String]) {

    println("addInt(1,3) = " + addInt(1, 3))
    println("addDouble(1.2,3.9) = " + addDouble(1.2, 3.9))
    println("add(1,4) = " + add(1, 4))
    println("add(1.6,9.2) = " + add(1.6, 9.2))

  }

  def addInt(i:Int, j:Int):Int = {i+j}
  def addDouble(i:Double, j:Double):Double = {i+j}

  def add(i:Int, j:Int):Int = {i+j}
  def add(i:Double, j:Double):Double = {i+j}

}


