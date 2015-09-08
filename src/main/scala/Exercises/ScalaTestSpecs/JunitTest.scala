package Exercises.ScalaTestSpecs

// Created by ZG on 15/9/8.
//

import org.junit._
import org.scalatest.junit.AssertionsForJUnit
//import org.mockito.Mockito._

class JunitTest extends AssertionsForJUnit{

  @Test
  def verifySomethingTest() {
    val three = 3
    assert(3 === three)
  }

}
