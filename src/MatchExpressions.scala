
// Created by ZG on 15/7/8.
// 

object MatchExpressions {
  def main(args: Array[String]) {
    println("matchColor(\"white\") = " + matchColor("white"))
    println("matchColor(\"blue\") = " + matchColor("blue"))
  }

  def matchColor(color:String):String = {
    color match {
      case "red" => "RED"
      case "blue" => "BLUE"
      case "green" => "GREEN"
      case _ => "UNKNOW COLOR: " + color
    }
  }

}
