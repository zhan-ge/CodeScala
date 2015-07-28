
// Created by ZG on 15/7/6.
// 

object Cat {
  def main(args: Array[String]) {
    val cat = new Cat
    val meow1 = cat.meow()
    assert("mew!" == meow1, "Expected mew!, Got " + meow1)
  }
}

class Cat{
  def meow(): String = { "mew!" }
}
