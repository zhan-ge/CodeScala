package CookCode.Traits

// Created by ZG on 15/8/4.
// 在特质中使用抽象或实际的字段

object UsingAbstractandConcreteFieldsinTraits {

}

trait PizzaTrait {
  var numToppings: Int        // abstract
  var size = 14               // concrete
  val maxNumToppings = 10     // concrete
}

// 使用PizzaTrait特质时，要么实现特质中的抽象字段，否则该类成为一个抽象类
class Pizza extends PizzaTrait {
  var numToppings = 0 // 'override' not needed
  size = 16 // 'var' and 'override' not needed
  override val maxNumToppings = 10 // 'override' is required ，重写val类型字段时，必须使用override
}