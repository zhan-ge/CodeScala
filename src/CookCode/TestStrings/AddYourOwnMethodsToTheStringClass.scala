package CookCode.TestStrings

// Created by ZG on 15/7/29.
// 

object AddYourOwnMethodsToTheStringClass extends App{

  implicit class StringImprovements(val s: String) {
    def increment:String = s.map(_.+(1).toChar)
    def decrement:String = s.map(_.-(1).toChar)
    def hideAll:String = s.replaceAll(".", "*")
    def plusOne = s.toInt + 1
    def asBoolean = s match {
      case "0" | "zero" | "" | " " => false
      case _ => true
    }

  }

  val result = "HAL".increment
  println("result = " + result)

  println("\"IBM\".decrement = " +"IBM".decrement)
  println("result.hideAll = " + result.hideAll)

  println("\"2\".plusOne = " + "2".plusOne)

  println("\"0\".asBoolean = " + "0".asBoolean)
  println("\"1\".asBoolean = " + "1".asBoolean)

}
