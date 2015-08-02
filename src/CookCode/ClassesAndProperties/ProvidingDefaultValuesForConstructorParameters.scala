package CookCode.ClassesAndProperties

// Created by ZG on 15/8/2.
// 为构造器参数提供默认值

object ProvidingDefaultValuesForConstructorParameters extends App{

  val s = new Socket()
  println("s.timeout = " + s.timeout)

}

class Socket (val timeout: Int = 10000)
// as same as below
class SocketAnother(val timeout: Int) {
  def this() = this(10000)
  override def toString = s"timeout: $timeout"
}
// 多参数提供默认值
class SocketMutParams(val timeout: Int = 1000, val linger: Int = 2000) {
  override def toString = s"timeout: $timeout, linger: $linger"
}