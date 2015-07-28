
// Created by ZG on 15/7/8.
// 

object For {
  def main(args: Array[String]) {

    var result1 = ""
    for(i <- 0 to 10){
      result1 += i + " "
    }
    println("result1 = " + result1)

    var result2 = ""
    for(i <- 0 until 10){
      result2 += i + " "
    }
    println("result2 = " + result2)

    var result3 = ""
    for(i<-Range(0,10)){
      result3 += i + " "
    }
    println("result3 = " + result3)

    var result4 = ""
    for(i <- Range(0,20,2)){
      result4 += i + " "
    }
    println("result4 = " + result4)

    var sum = 0
    for(i <- Range(0,20,2)){
      println("adding " + i + " to " +  sum)
      sum += i
    }
    println("sum = " + sum)


  }
}
