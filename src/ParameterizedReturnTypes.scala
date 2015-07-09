
// Created by ZG on 15/7/9.
// 

object ParameterizedReturnTypes {
  def main(args: Array[String]) {

    println("inferred('a', 'b', 'c') = " + inferred('a', 'b', 'c'))
    println("explicit('a', 'b', 'c') = " + explicit('a', 'b', 'c'))

  }

  // 推断返回类型
  def inferred(c1:Char, c2:Char, c3:Char) = {
    Vector(c1,c2,c3)
  }

  // 明确定义返回类型
  def explicit(c1:Char, c2:Char, c3:Char):Vector[Char] = {
    Vector(c1, c2, c3)
  }



}

