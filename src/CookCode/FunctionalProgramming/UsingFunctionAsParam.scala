package CookCode.FunctionalProgramming

// Created by ZG on 15/8/4.
// 将函数当做参数传递
/*
 three-step process:
  1.定义你的方法，包括你想利用作为方法参数的函数签名。
  2.定义匹配该签名的一个或多个功能。
  3.一段时间后，传递函数（S ）作为参数传递给你的方法。
 */

object UsingFunctionAsParam extends App{

  // 定义函数签名：传入的方法调用 => 返回值类型。传入的方法参数必须遵循此签名
  def executeFunction(callback:() => Unit) {
    callback()
  }
  val sayHello = () => { println("Hello") }
  executeFunction(sayHello)


  def executeAndPrint(f:(Int, Int) => Int, x: Int, y: Int) {
    val result = f(x, y)
    println(result)
  }
  val sum = (x: Int, y: Int) => x + y
  val multiply = (x:Int,y:Int) => x*y
  executeAndPrint(sum, 2, 9)      // prints 11
  executeAndPrint(multiply, 3, 9) // prints 27

}
