package testForScalaTest

// Created by ZG on 15/9/8.
//

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class PizzaSpec3 extends FunSuite with BeforeAndAfter{

  val pizza = new Pizza

  // add tests here ...
  test("test topping quantity") (pending)

  test("new pizza has zero toppings (version 2)") {
    // intentional error here; size should be 0
    assert(2 === 1)
  }

  test("new pizza has zero toppings (version 3)") {
    assertResult(1) {
      3     // process result
    }
  }

  test ("catching an exception 1") {
    val thrown = intercept[Exception] {
      pizza.boom
    }
    assert(thrown.getMessage === "Boom!")
  }

  test ("catching an exception 2") {
    intercept[Exception] { pizza.boom } // if pizza.boom don't thorw a exception, test failed
  }

}
