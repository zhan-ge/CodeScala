package testForScalaTest

// Created by ZG on 15/9/8.
//

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

@RunWith(classOf[JUnitRunner])
class JunitSpec  extends FunSuite with BeforeAndAfter{

  test("junit with scalatest test") {
    assertResult(0) {
      1
    }
  }

}
