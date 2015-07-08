
// Created by ZG on 15/7/8.
// 

object ForWithRanges {
  def main(args: Array[String]) {

    var result = ""
    for(i <- Range(0, 10)){
      result += i + " "
    }
    println("result = " + result)

    result = ""
    for(i <- Range(1,23,3)){
      result += i + " "
    }
    println("result = " + result)


  }
}
