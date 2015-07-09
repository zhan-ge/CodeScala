
// Created by ZG on 15/7/9.
// 

object GardenGnome {
  def main(args: Array[String]) {

    println("new GardenGnome(20.0, 110.0, false).show() = " + new GardenGnome(20.0, 110.0, false).show())

  }
}

class GardenGnome(val height:Double, val weight:Double, val happy:Boolean){

  println("Inside primary constructor")
  var painted = true

  def magic(level:Int):String = {
    println("in magic")
    "Poof! " + level
  }

  def this(height:Double){
    this(height, 100.0, true)
    println("in this1")
  }

  def this(name:String) = {
    this(15.0)
    println("painted = " + painted)
    println("in this2")
  }

  def show():String = {
    println("in show")
    height + " " + weight+ " " + happy + " " + painted
  }

}
