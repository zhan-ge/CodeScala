package pythagorean

// Created by ZG on 15/7/8.
// 

class PythagoreanTheorem {

}

class RightTriangle {
  def hypotenuse(a: Double, b: Double): Double = {
    Math.sqrt(a * a + b * b)
  }

  def area(a: Double, b: Double): Double = {
    a * b / 2
  }
}
