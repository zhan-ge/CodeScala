package CookCode.ClassesAndProperties

// Created by ZG on 15/8/2.
// 定义多个辅助构造器，使类有多种实例化方式

object DefiningAuxiliaryConstructors extends App{

  // 调用主构造器
  val p1 = new Pizza(9, "fish")

  // 调用String参数类型的辅助构造器
  val p2 = new Pizza("fish")

  // 调用Int参数类型的辅助构造器
  val p3 = new Pizza(9)

  // 调用无参构造器
  val p4 = new Pizza()

}


class Pizza(var crustSize:Int, var crustType:String){

  // 单参数构造器
  def this(crustSize: Int) {
    this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
  }

  // 单参数构造器
  def this(crustType: String) {
    this(Pizza.DEFAULT_CRUST_SIZE, crustType)
  }

  // 无参数构造器
  def this() {
    this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  }

  override def toString = s"A $crustSize inch pizza with a $crustType crust"

}

object Pizza {
  val DEFAULT_CRUST_SIZE = 12
  val DEFAULT_CRUST_TYPE = "THIN"
}