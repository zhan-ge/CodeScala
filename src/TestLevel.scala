
// Created by ZG on 15/7/12.
// 

object TestLevel {
  def main(args: Array[String]) {
    println("Level.Empty = " + Level.Empty)

    val va1 = {for(lev <- Level.values)
      yield lev }.toIndexedSeq
    println("va1 = " + va1)

    val va2 = {for(n <- Range(0, Level.maxId))
      yield (n, Level(n))}
    println("va2 = " + va2)

  }
}

object Level extends Enumeration{
  type Level = Value
  val Overflow, High, Medium, Low, Empty = Value
}
