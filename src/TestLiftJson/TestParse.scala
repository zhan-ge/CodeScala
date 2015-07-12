package TestLiftJson

// Created by ZG on 15/7/12.
// 

import net.liftweb.json._

object TestParse extends App{
  val res = """ { "numbers" : [1, 2, 3, 4] } """
  val js = parse(res)
  println("js.values = " + js.values)
}
