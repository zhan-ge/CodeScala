
// Created by ZG on 15/7/20.
// 

object TestRandomFromArray extends App{

  println(Agents.mobile)

}

import scala.util.Random

object Agents{

  val MOBILE = List(
  "11",
  "22",
  "33"
  )
  def mobile = Random.shuffle(MOBILE).head

}
