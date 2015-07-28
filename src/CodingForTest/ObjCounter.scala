
// Created by ZG on 15/7/11.
// 

object ObjCounter {
  def main(args: Array[String]) {
    println("Vector(new Count, new Count, new Count, new Count) = "
      + Vector(new Count, new Count, new Count, new Count))
  }
}

class Count() {
  val id = Count.id()
  override def toString = s"Count$id"
}

object Count {
  var n = -1
  def id() = {
    n += 1
    n
  }
}
