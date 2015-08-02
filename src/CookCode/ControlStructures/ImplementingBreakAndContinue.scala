package CookCode.ControlStructures

// Created by ZG on 15/8/2.
// 

object ImplementingBreakAndContinue extends App{

  // Scala doesn’t have break and continue keywords,
  // but it does offer similar functionality through scala.util.control.Breaks.
  import util.control.Breaks._
  println("\n=== BREAK EXAMPLE ===")
  breakable {
    for (i <- 1 to 10) {
      println(i)
      if (i > 4) break() // break out of the for loop
    } }

  println("\n=== CONTINUE EXAMPLE ===")
  val searchMe = "peter piper picked a peck of pickled peppers"
  var numPs = 0
  for (i <- 0 until searchMe.length) {
    breakable {
      if (searchMe.charAt(i) != 'p') {
        break() // break out of the 'breakable', continue the outside loop
         }
      else {
        numPs += 1 }
    } }
  println("Found " + numPs + " p's in the string.")

  import util.control._
  val Inner = new Breaks
  val Outer = new Breaks
  Outer.breakable {
    for (i <- 1 to 5) {
      Inner.breakable {
        for (j <- 'a' to 'e') {
          if (i == 1 && j == 'c') Inner.break()
          else println(s"i: $i, j: $j")
          if (i == 2 && j == 'b') Outer.break()
        }
      }
    }
  }


}
