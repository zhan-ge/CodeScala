
// Created by ZG on 15/7/11.
// 

object AuxiliaryInitialization {
  def main(args: Array[String]) {

    val h = new Home("888N.MainSt.", "KS", "66632", "Metropolis")
    println("h.toString = " + h.toString)
    println("h.address = " + h.address)
    println("h.state = " + h.state)
    println("h.zip = " + h.zip)
    println("h.name = " + h.name)

    val v = new VacationHouse("KS", "66632", 6, 8)
    println("v.state = " + v.state)
    println("v.zip = " + v.zip)
    println("v.startMonth = " + v.startMonth)
    println("v.endMonth = " + v.endMonth)

    val tree = new TreeHouse("Oak","48104")
    println("tree.name = " + tree.name)
    println("tree.zip = " + tree.zip)

  }
}

class House(val address:String, val state:String, val zip:String){
  def this(state:String, zip:String) = {
    this("address?", state, zip)
  }
  def this(zip:String) = {
    this("address?", "state?", zip)
  }
}

class Home(address:String, state:String, zip:String, val name:String)
  extends House(address, state, zip){
  override def toString =
    s"$name: $address, $state $zip"
}

class VacationHouse(state:String, zip:String, val startMonth:Int, val endMonth:Int)
  extends House(state, zip)

class TreeHouse(val name:String, zip:String)
  extends House(zip)

