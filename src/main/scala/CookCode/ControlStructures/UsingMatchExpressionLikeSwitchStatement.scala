package CookCode.ControlStructures

// Created by ZG on 15/8/2.
// 

object UsingMatchExpressionLikeSwitchStatement extends App{

  val i = 7
  // i is an integer
  i match {
    case 1 => println("January")
    case 2 => println("February")
    case 3 => println("March")
    case 4 => println("April")
    case 5 => println("May")
    case 6 => println("June")
    case 7 => println("July")
    case 8 => println("August")
    case 9 => println("September")
    case 10 => println("October")
    case 11 => println("November")
    case 12 => println("December")
    // catch the default with a variable so you can print it case whoa => println("Unexpected case: " + whoa.toString)
  }

  val month = i match {
    case 1 => "January"
    case 2 => "February"
    case 3 => "March"
    case 4 => "April"
    case 5 => "May"
    case 6 => "June"
    case 7 => "July"
    case 8 => "August"
    case 9 => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _ => "Invalid month" // the default, catch-all
  }
  println("month = " + month)

  case class Person(name:String)

  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case _ => "Unknown"
  }

//  Do you really need a switch statement?
  val monthNumberToName = Map( 1 -> "January",
    2 -> "February",
    3 -> "March",
    4  -> "April",
    5  -> "May",
    6  -> "June",
    7  -> "July",
    8  -> "August",
    9  -> "September",
    10 -> "October",
    11 -> "November",
    12 -> "December"
  )
  val monthName = monthNumberToName(4)
  println(monthName) // prints "April"

}
