
// Created by ZG on 15/7/9.
// 

object Coffee {
  def main(args: Array[String]) {
    val caf = new Coffee(3,true,true,true,"aasas")

    println("caf.result = " + caf.result)
  }
}

class Coffee(
            val shots:Int = 2,
            val decaf:Boolean = false,
            val milk:Boolean = false,
            val toGo:Boolean = false,
            val syrup:String = ""
              ){
  var result = ""
  println("shots, decaf, milk,toGo, syrup")

  def getCup():Unit = {
    if(toGo){
      result += "ToGoCup"
    }
    else{
      result += "HereCup"
    }
  }

  def pourShots():Unit = {
    for (x <- 0 until shots) {
      if(decaf){
        result += "decaf shot"
      }
      else{
        result += "shot"
      }
    }
  }

  def addMilk():Unit = {
    if(milk){
      result += "milk"
    }
  }

  def addSyrup():Unit = {
    result += syrup
  }

  getCup()
  pourShots()
  addMilk()
  addSyrup()

}