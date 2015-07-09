
// Created by ZG on 15/7/9.
// 

object TupleUnpacking {
  def main(args: Array[String]) {

    // unpack tuple
    val (n, d, a, b, h) = f
    println("n, d, a, b, h = " + n, d, a, b, h)

    // index tuple
    val all = f
    println("f._1 = " + all._1)
    println("f._4 = " + all._4)

    // unpack case class
    val empA = Employee("Bob", 1130)
    val Employee(nm, id) = empA
    println("nm, id = " + nm, id)

  }

  def f = (1,3.14,"Mouse",false,"Altitude")

}

case class Employee(name:String, ID:Int)
