
// Created by ZG on 15/7/2.
// 

object CompoundExpressions1 {
  def main(args: Array[String]) {

    val hour = 6
    val isOpen = {
      val opens = 9
      val close = 20
      println("Operating hours: " + opens + " - " + close)

      if (hour > opens && hour <= close){
        true
      } else{ false }
    }

    println("isOpen = " + isOpen)

  }
}
