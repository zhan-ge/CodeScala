package CookCode.ClassesAndProperties

// Created by ZG on 15/8/2.
// 定义qeuals方法，比较对象实例之间的相等性

object DefiningAnEqualsMethod extends App{

}

class PersonE (name: String, age: Int) {
  def canEqual(a: Any) = a.isInstanceOf[PersonE]

  override def equals(that: Any): Boolean =
    that match {
      case that: PersonE => that.canEqual(this) && this.hashCode == that.hashCode
      case _ => false
  }

  override def hashCode:Int = {
    val prime = 31
    var result = 1
    result = prime * result + age
    result = prime * result + (if (name == null) 0 else name.hashCode)
    result
  }
}