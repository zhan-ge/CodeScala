
// Created by ZG on 15/7/8.
// 

object OneOrTheOther {
  def main(args: Array[String]) {

    val v1 = Vector(1)
    val v2 = Vector(2,3)

    println("oneOrTheOther(v1 == v1.reverse) = " + oneOrTheOther(v1 == v1.reverse))
    println("oneOrTheOther(v2 == v2.reverse) = " + oneOrTheOther(v2 == v2.reverse))

  }

  def oneOrTheOther(exp:Boolean):String = {
    if(exp){
      "True"
    } else{
      "False"
    }
  }

}
