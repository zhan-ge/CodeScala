
// Created by ZG on 15/7/9.
// 

object CallLater {
  def main(args: Array[String]) {
    val c1 = new Later(() => println("now"))
    c1.call()
  }
}

class Later(val f:() => Unit){
  def call():Unit = {f()}
}
