
// Created by ZG on 15/7/8.
// 

object VisibleClassArgs {
  def main(args: Array[String]) {

    val ca2 = new ClassArg2(20)
    val ca3 = new ClassArg3(22)

    println("ca2.a = " + ca2.a)
    ca2.a = 33
    println("ca2.a = " + ca2.a)

    println("ca3.a = " + ca3.a)  // Can't do this: ca3.a = 35

  }
}

class ClassArg2(var a:Int)        // could change
class ClassArg3(val a:Int)        // couldn't change
