package CookCode.ClassesAndProperties

// Created by ZG on 15/8/2.
// 重写默认生成的getter和setter

object OverridingDefaultAccessorsAndMutators extends App{

  val p = new PersonThis("Jonathan")
  p.name = "newName"
  println("p.name = " + p.name)

}

class PersonThis(private var _name: String) {
  def name = _name                            // 取值器
  def name_=(aName: String) { _name = aName } // 改值器
}

// 重写getter和setter的一半流程，（构造器重的private是必须的）
//1. Create a private var constructor parameter with a name you want to reference from within your class. In the example in the Solution, the field is named _name.
//2. Define getter and setter names that you want other classes to use. In the Solution the getter name is name, and the setter name is name_= (which, combined with Scala’s syntactic sugar, lets users write p.name = "Jony").
//3. Modify the body of the getter and setter methods as desired.