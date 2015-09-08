package Exercises.ScalaTestSpecs

// Created by ZG on 15/9/7.
//

import org.scalatest.Matchers

object AssertsEx extends Matchers with App{

  val left = 2
  val right = 1
  assert(left != right)   // If true, return normally, else, complete abruptly with an AssertionError

  val result = left + right

  result should equal (3) // can customize equality
  result should === (3)   // can customize equality and enforce type constraints
  result should be (3)    // cannot customize equality, so fastest to compile
  result shouldEqual 3    // can customize equality, no parentheses required
  result shouldBe 3       // cannot customize equality, so fastest to compile, no parentheses required

}
