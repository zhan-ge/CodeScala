
// Created by ZG on 15/7/12.
// 

object ApplyOperation extends App{
  val app = ApplyTest()
  app.atry()
}

class ApplyTest {
  def apply() = {
    println("In class ApplyTest.")
  }

  def atry(): Unit ={
    println("Have a try on apply!")
  }
}

// 类ApplyTest的伴生对象，实现apply方法后，实例化时不再需要new
object ApplyTest{
  def apply() = {
    println("In object ApplyTest.")
    new ApplyTest
  }
}