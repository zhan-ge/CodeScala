
// Created by ZG on 15/7/9.
// 

object PatternMatchingWithTypes {
  def main(args: Array[String]) {
    println("acceptAnything(5) = " + acceptAnything(5))
    println("acceptAnything(\"jetty\") = " + acceptAnything("jetty"))
    println("acceptAnything(22.5) = " + acceptAnything(22.5))
    val p1 = Person("Anna")
    println("acceptAnything(p1) = " + acceptAnything(p1))
  }

  def acceptAnything(x:Any):String = {
    x match {
      case s:String => "A String: " + s
      case i:Int if i < 20 => s"A Int less than 20: $i"
      case i:Int => s"Some other Int: $i"
      case p:Person => s"A Person ${p.name}"
      case _ => "I don't know what that is!"
    }
  }

}

case class Person(name:String)


