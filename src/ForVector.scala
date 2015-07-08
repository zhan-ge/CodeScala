
// Created by ZG on 15/7/8.
// 

object ForVector {
  def main(args: Array[String]) {
    val v = Vector("Somewhere", "over", "the", "rainbow")
    for(word <- v){
      println("word = " + word)
    }
  }
}
