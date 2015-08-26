package TestExceptions

// Created by ZG on 15/8/20.
//

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

import scala.util.control.ControlThrowable

object TestException extends App{

  try {
    val f = new FileReader("input.txt")
  } catch {
    case ex: FileNotFoundException =>{
      println("Missing file exception")
    }
    case ex: IOException => {
      println("IO Exception")
    }
  }

  def safely[T](handler: PartialFunction[Throwable, T]): PartialFunction[Throwable, T] = {
    case ex: ControlThrowable => throw ex
    // case ex: OutOfMemoryError (Assorted other nasty exceptions you don't want to catch)

    //If it's an exception they handle, pass it on
    case ex: Throwable if handler.isDefinedAt(ex) => handler(ex)

    // If they didn't handle it, rethrow. This line isn't necessary, just for clarity
    case ex: Throwable => throw ex
  }

  // usage
  def doSomething() = {
    try {
      val f = new FileReader("input.txt")
    } catch safely {
      case ex: Throwable => println("AHHH")
    }
  }
  doSomething()

}
