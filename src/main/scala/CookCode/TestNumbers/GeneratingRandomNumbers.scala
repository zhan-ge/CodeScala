package CookCode.TestNumbers

// Created by ZG on 15/7/30.
//

import scala.util.Random

object GeneratingRandomNumbers extends App{

  val rand = Random
  println("rand.nextInt() = " + rand.nextInt())
  println("rand = " + rand.nextInt(100))

}
