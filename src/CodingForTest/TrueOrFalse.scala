
// Created by ZG on 15/7/8.
// 

object TrueOrFalse {
  def main(args: Array[String]) {

    val b = 1
    println("trueOrFalse(b>3) = " + trueOrFalse(b > 3))
    println("trueOrFalse(b>3) = " + trueOrFalse(b < 3))

  }

  def trueOrFalse(exp:Boolean):String = {
    if(exp){
      return "It's true!"
    }
    "It's false!"
  }

}
