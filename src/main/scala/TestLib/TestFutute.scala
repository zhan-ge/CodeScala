package TestLib

// Created by ZG on 15/9/9.
//

import scala.util.{Success, Failure}

import scala.util.Try
import concurrent.Future
import concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.Random

object TestFutute extends App{

  def sleep(duration: Long) { Thread.sleep(duration) }

  println("1 - starting calculation ...")
  val f = Future {
    sleep(Random.nextInt(500))
    42
  }

  println("2 - before onComplete")
  f.onComplete {
    case Success(value) => println(s"Got the callback, meaning = $value")
    case Failure(e) => e.printStackTrace
  }

  println("A ..."); sleep(100)
  println("B ..."); sleep(100)
  println("C ..."); sleep(100)
  println("D ..."); sleep(100)
  println("E ..."); sleep(100)
  println("F ..."); sleep(100)

}
