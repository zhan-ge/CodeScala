package CookCode.Method

// Created by ZG on 15/8/3.
// 

object UsingParameterNamesWhenCallingMethod extends App{

  val p = new Pizza
  println(p)
  p.update(crustSize = 16, crustType = "Thick")
  println(p)
  p.update(crustType = "Pan", crustSize = 14)
  println(p)

}

class Pizza {
  var crustSize = 12
  var crustType = "Thin"
  def update(crustSize: Int, crustType: String) {
    this.crustSize = crustSize
    this.crustType = crustType }
  override def toString = {
    "A %d inch %s crust pizza.".format(crustSize, crustType)
  }
}
