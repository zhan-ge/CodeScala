package CookCode.Objects

// Created by ZG on 15/8/3.
// 

object CreatingObjectInstancesWithoutUsingthenewKeyword extends App{

  val dawn = Person("Dawn")
  val a = Array(Person("Dan"), Person("Elijah"))

  val p1 = PersonNew("p1")
  println(p1.age)
  println(p1.name)

  val p2 = PersonNew("p1", 2)
  println(p2.age)
  println(p2.name)

}

class Person {
  var name: String = _
}

object Person {
  def apply(name: String): Person = {
    val p = new Person
    p.name = name
    p
  }
}

class PersonNew {
  var name = ""
  var age = 0
}

object PersonNew {
  // a one-arg constructor
  def apply(name: String): PersonNew = {
    val p = new PersonNew
    p.name = name
    p
  }

  // a two-arg constructor
  def apply(name: String, age: Int): PersonNew = {
    val p = new PersonNew
    p.name = name
    p.age = age
    p
  }
}
