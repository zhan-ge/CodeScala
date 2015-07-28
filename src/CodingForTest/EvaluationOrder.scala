
// Created by ZG on 15/7/1.
// 

object EvaluationOrder {
  def main(args: Array[String]) {
    val sunny = true
    val hoursleep = 6
    val exercise = false
    val temp = 55

    val happy1 = sunny && temp > 50 || exercise && hoursleep > 7
    println("happy1 = " + happy1)

    val samehappy1 = (sunny && temp > 50) || (exercise && hoursleep > 7)
    println("samehappy1 = " + samehappy1)

    val notsame = (sunny && temp >50 || exercise) && hoursleep > 7
    println("notsame = " + notsame)

  }
}
