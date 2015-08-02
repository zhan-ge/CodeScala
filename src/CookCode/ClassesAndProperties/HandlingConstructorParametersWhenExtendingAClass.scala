package CookCode.ClassesAndProperties

// Created by ZG on 15/8/2.
// 

object HandlingConstructorParametersWhenExtendingAClass extends App{

  val teresa = new Employee("Teresa", Address("Louisville", "KY"), 25)

}

case class Address (city: String, state: String)

class PersonBase (var name: String, var address: Address) {
  override def toString = if (address == null) name else s"$name @ $address"
}

class Employee (name: String, address: Address, var age: Int) extends PersonBase(name, address){
  // rest of class
}
