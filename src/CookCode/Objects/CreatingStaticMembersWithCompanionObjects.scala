package CookCode.Objects

// Created by ZG on 15/8/3.
// 

object CreatingStaticMembersWithCompanionObjects extends App{

  val p = new Pizza(Pizza.CRUST_TYPE_THICK)
  println(p)

  println(Pizza.getFoo)

}

// Pizza class
class Pizza (var crustType: String) {
  override def toString = "Crust type is " + crustType
}

// companion object
object Pizza {
  val CRUST_TYPE_THIN = "thin"
  val CRUST_TYPE_THICK = "thick"
  def getFoo = "Foo"
}