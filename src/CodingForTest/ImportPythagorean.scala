
// Created by ZG on 15/7/8.
// 

import pythagorean.RightTriangle

class ImportPythagorean {

  val rt = new RightTriangle
  println(rt.hypotenuse(3,4))
  println(rt.area(3,4))
  assert(rt.hypotenuse(3,4) == 5)
  assert(rt.area(3,4) == 6)

}
