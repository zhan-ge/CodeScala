
// Created by ZG on 15/7/6.
// 

object Hamster {
  def main(args: Array[String]) {

    val hamster = new Hamster
    val e1 = hamster.exercise()
    assert("squeak! Running on wheel" == e1, "Expected squeak! Running on wheel" + ", Got " + e1)

  }
}

class Hamster{
  def speak(): String = {  "squeak!" }
  def exercise(): String = {
    speak() + " Running on wheel"
  }
}
