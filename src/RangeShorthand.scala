
// Created by ZG on 15/7/8.
// 

object RangeShorthand {

  def main(args: Array[String]) {

    var result = ""
    for(i <- 0 until 10){
      result += i + " "
    }
    println("result = " + result)

    result = ""
    for(i <- 0 to 10){
      result += i + " "
    }
    println("result = " + result)

    result = ""
    for(i <- 'a' to 'g'){
      result += i + " "
    }
    println("result = " + result)


  }
}
