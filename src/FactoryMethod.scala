
// Created by ZG on 15/7/11.
// 

object FactoryMethod {
  def main(args: Array[String]) {
    val myCar = Car("Toyota")
    println("myCar = " + myCar)
    println("myCar.make = " + myCar.make)
  }
}

class Car(val make:String){
  override def toString = s"Car($make)"
}

object Car {
  def apply(make:String) = new Car(make)
}