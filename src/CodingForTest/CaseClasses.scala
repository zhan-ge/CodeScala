
// Created by ZG on 15/7/9.
// 

object CaseClasses {
  def main(args: Array[String]) {

    val dog1 = Doog("aaa")
    val dog2 = Doog("bbb")
    val dogs = Vector(Doog("aaa"), Doog("bbb"), Doog("ccc"))
    println("dogs = " + dogs)

  }
}

case class Doog(name:String)
case class Caat(name:String, age:Int)