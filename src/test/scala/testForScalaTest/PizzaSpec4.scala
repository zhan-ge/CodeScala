package testForScalaTest

// Created by ZG on 15/9/8.
//

// run test with tag:
// sbt: test-only -- -n "DatabaseTest"    // add another tag with a blank like "DatabaseTest RestTest"
// run test without tag:
// sbt: test-only -- -l "DatabaseTest"

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.Tag

object DatabaseTest extends Tag("DatabaseTest")

class PizzaSpec4 extends FunSuite with BeforeAndAfter{

  test("just run database test", DatabaseTest) {
    assertResult(0) {
      1
    }
  }

  test("not a database test") {
    assertResult(0) {
      2
    }
  }

}
