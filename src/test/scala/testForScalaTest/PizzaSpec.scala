package testForScalaTest

// Created by ZG on 15/9/8.
//

import org.scalatest.{BeforeAndAfter, FunSpec}

class PizzaSpec extends FunSpec with BeforeAndAfter {
  var pizza: Pizza = _

  before {
    pizza = new Pizza
  }

  describe("A Pizza") {

    it("should start with no toppings") {
      assert(pizza.getToppings.isEmpty)
    }

    it("should start 2 no toppings") {
      assert(1===2)
    }

    it("should allow addition of toppings") (pending)

    it("should allow removal of toppings") (pending)
  }

}
