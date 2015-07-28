
// Created by ZG on 15/7/9.
// 

object PatternMatchingCaseClasses {
  def main(args: Array[String]) {

    val travelers = Vector(
      Passenger("Harvey", "Rabbit"),
      Passenger("Dorothy", "Gale")
    )

    val trip = Vector(
      Train(travelers, "Reading"),
      Bus(travelers, 100)
    )

    println("travel(trip(0)) = " + travel(trip.head))
    println("travel(trip(1)) = " + travel(trip(1)))

  }

  def travel(transport:Any):String = {
    transport match {
      case Train(travelers, line) => s"Train line $line $travelers"
      case Bus(travelers, seats) => s"Bus size $seats $travelers"
      case Passenger => "Walking along"
      case what => s"$what in the limbo!"
    }
  }

}

case class Passenger(first:String, last:String)

case class Train(travelers:Vector[Passenger], line:String)

case class Bus(passengers:Vector[Passenger], capacity:Int)