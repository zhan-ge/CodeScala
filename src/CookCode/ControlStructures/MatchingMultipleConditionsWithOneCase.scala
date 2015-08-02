package CookCode.ControlStructures

// Created by ZG on 15/8/2.
// 

object MatchingMultipleConditionsWithOneCase extends App{

  val i = 5
  i match {
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even") }

  val cmd = "stop"
  cmd match {
    case "start" | "go" => println("starting")
    case "stop" | "quit" | "exit" => println("stopping")
    case _ => println("doing nothing")
  }

  trait Command
  case object Start extends Command
  case object Go extends Command
  case object Stop extends Command
  case object Whoa extends Command
  def executeCommand(cmd: Command) =
    cmd match {
      case Start | Go => println("start")
      case Stop | Whoa => println("stop")
  }

}
