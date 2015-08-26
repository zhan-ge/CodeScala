package CookCode.ClassesAndProperties

// Created by ZG on 15/8/2.
// 使一个类的主构造器为private，例如实现单例模式的时候

object DefiningAPrivatePrimaryConstructor {
  // this won't compile
  // val brain = new Brain

  // this works，必须调用getInstance方法创建实例，不能通过主构造器实例化
  val brain = Brain.getInstance
  println(brain)
}

class Brain private {
  override def toString = "This is the brain."
}
// 半生对象
object Brain {
  val brain = new Brain
  def getInstance = brain
}
