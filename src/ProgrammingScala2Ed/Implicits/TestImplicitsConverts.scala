package ProgrammingScala2Ed.Implicits

// Created by ZG on 15/8/25.
//

abstract class TimeDuration{
  def toMills:Int
  override def toString = "we got %d mills".format(toMills)
}

case class Seconds(length:Int) extends TimeDuration{
  def toMills = length * 1000
}

case class Minutes(length:Int) extends TimeDuration{
  def toMills = length * 1000 * 60
}

case class Hours(length:Int) extends TimeDuration{
  def toMills = length * 1000 * 60 * 60
}

//class Duration(length:Int){
//  def seconds = Seconds(length)
//  def minutes = Minutes(length)
//  def hours = Hours(length)
//}
//object Duration{
//  implicit def IntToDuration(i:Int): Duration = new Duration(i)
//}

object IntExtentDurations{
  implicit class IntExtentDuration(length:Int){
    def seconds = Seconds(length)
    def minutes = Minutes(length)
    def hours = Hours(length)
  }
}



object TestImplicitsConverts extends App{

//  println(new Duration(2).seconds)
//
//  import Duration._
//  println(2.seconds)

  import IntExtentDurations._
  println(2.seconds)

}



