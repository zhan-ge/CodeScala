
// Created by ZG on 15/7/9.
// 

object SurreyWithToString {
  def main(args: Array[String]) {
    val sur = new Surrey2("aand asd!")
    println(sur)            // sur.toString
  }
}

class Surrey2(val adornment:String){
  override def toString =
  s"Surrey with the $adornment"
}
