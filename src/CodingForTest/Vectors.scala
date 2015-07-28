
// Created by ZG on 15/7/8.
// 

object Vectors {
  def main(args: Array[String]) {

    // A Vector holds other objects:
    val v1 = Vector(1,2,3,4,5)
    println("v1 = " + v1)
    println("v1(4) = " + v1(4))     // equals 5

    // Take each element of the Vector:
    var result = ""
    for(i <- v1){
      result += i + " "
    }
    println("result = " + result)

    val v3 = Vector(1.1, 2.2, 3.3, 4.4)
    // reverse is an operation on the Vector:
    println("v3.reverse = " + v3.reverse)

    val v4 = Vector("Twas", "Brillig", "And", "Slithy", "Toves")
    println("v4.sorted = " + v4.sorted)

    println("v4.head = " + v4.head)

    println("v4.tail = " + v4.tail)

  }
}
