package CookCode.ControlStructures

// Created by ZG on 15/8/2.
// 

object AddingIfExpressionsToCaseStatements extends App{

  val i = 12
  i match {
    case a if 0 to 9 contains a => println("0-9 range: " + a)
    case b if 10 to 19 contains b => println("10-19 range: " + b)
    case c if 20 to 29 contains c => println("20-29 range: " + c)
    case _ => println("Hmmm...")
  }

  val num = 1
  num match {
    case x if x == 1 => println("one, a lonely number")
    case x if x == 2 || x == 3 => println(x)
    case _ => println("some other value")
  }

  case class Stock(symbol:String, price:Int)
  val stock = Stock("XYZ", 26)
  stock match {
    case x if x.symbol == "XYZ" && x.price < 20 => println("buy")
    case x if x.symbol == "XYZ" && x.price > 50 => println("sell")
    case _ => // do nothing
  }

//  def speak(p: Person) = p match {
//    case Person(name) if name == "Fred" => println("Yubba dubba doo")
//    case Person(name) if name == "Bam Bam" => println("Bam bam!")
//    case _ => println("Watch the Flintstones!")
//  }

//  case Person(name) =>
//    if (name == "Fred") println("Yubba dubba doo")
//    else if (name == "Bam Bam") println("Bam bam!")

}
