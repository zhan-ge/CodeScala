
// Created by ZG on 15/7/2.
// 

object CompoundExpressions2 {

  def main(args: Array[String]) {

    val activity = "swimming"
    val hour = 10

    val isOpen = {
      if (activity == "swimming" || activity == "ice skating"){
        val opens = 9
        val close = 20
        println("Operating hours: " + opens + " - " + close)
        if (hour >= opens && hour <= close){
          true
        } else{
          false
        }
      } else {
        false
      }
    }
    println("isOpen = " + isOpen)
  }

}
