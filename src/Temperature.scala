
// Created by ZG on 15/7/8.
// 

object Temperature {
  def main(args: Array[String]) {

    val temp = new Temperature
    temp.setFahrenheit(98.6)
    println("temp.getFagrenheit = " + temp.getFagrenheit)
    println("temp.getCelsius = " + temp.getCelsius)

    temp.setCelsius(100.0)
    println("temp.getFagrenheit = " + temp.getFagrenheit)

  }
}

class Temperature {
  var current = 0.0
  var scale = "f"

  def setFahrenheit(now:Double):Unit = {
    current = now
    scale = "f"
  }

  def setCelsius(now:Double):Unit = {
    current = now
    scale = "c"
  }

  def getFagrenheit:Double = {
    if (scale=="f"){
      current
    }
    else{
      current * 9.0 /5.0 + 32.0
    }
  }

  def getCelsius:Double = {
    if (scale=="c"){
      current
    }
    else{
      (current - 32.0) * 5.0 /9.0
    }
  }

}
