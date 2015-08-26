package CookCode.ClassesAndProperties

// Created by ZG on 15/8/2.
// 为case类创建构造函数

object GeneratingAuxiliaryConstructorsForCaseClasses extends App{

  val p = PersonNew("John Smith", 30)
  // 使用上述方法实例化case类的时候实际上是使用调用了case类的apply方法
  val p1 = PersonNew.apply("John Smith", 30)

  // 使用半生对象定义case类的apply方法

  // 调用PersonNew的无参apply方法创建PersonNew实例
  val p2 = PersonNew()
  println("p2.name = " + p2.name)
  println("p2.age = " + p2.age)

  // 调用PersonNew的单参数apply方法
  val p3 = PersonNew("P3")
  println("p3.name = " + p3.name)
  println("p3.age = " + p3.age)



}

case class PersonNew (var name: String, var age: Int)

// case类的伴生对象
object PersonNew {
  // 定义case类的apply方法
  def apply() = new PersonNew("<no name>", 0)
  def apply(name: String) = new PersonNew(name, 0)
}