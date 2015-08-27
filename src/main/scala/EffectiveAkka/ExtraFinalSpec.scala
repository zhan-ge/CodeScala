package EffectiveAkka

// Created by ZG on 15/8/27.
//

import akka.actor._
import akka.event.LoggingReceive
import scala.concurrent.duration._

case class Messages(messages:List[Int])

case class SuccessMessage()
case class FaieldMessage()

case object TimeOutMessage

object ExtraFinalSpec extends App{

  implicit val system = ActorSystem("ExtraFinalSpec")

  val savingsAccountsTwo = system.actorOf(Props[ActorLevelTwo], "ActorLevelTwo")
  val savingsAccountsOne = system.actorOf(Props(new ActorLevelOne(savingsAccountsTwo)), "ActorLevelOne")

  println("ExtraFinalSpec Starting!")

  savingsAccountsOne ! "11111111"
  savingsAccountsOne ! "3333333333333"
  println("Messages Starting!")

}

class ActorLevelOne(savingsAccountsTwo:ActorRef) extends Actor{

  println("ActorLevelOne Starting!")

  def receive = {
    case str:String =>
      println("Received a message list in ActorLevelOne!")
      val originalSender = sender()
      val messageLength = str.length

      context.actorOf(Props(new Actor() {
        var result:String = ""

        def receive = LoggingReceive {
          case re:String =>
            result += re
            checkReply()

          case TimeOutMessage => println("Time out, receive parent and shutdown this subActor.")
        }

        def checkReply() = {
          println("Check for all right!")
          if (result.length == messageLength) {
            println(s"All done, shutdown! Message: $str, result: $result")
            timeoutMessager.cancel()      // all done, cancel the timeout setting.
            originalSender ! result
            context.stop(self)
          }
          else println("No done, go on!")
        }

        str.foreach(savingsAccountsTwo ! _.toString)

        // time out settings
        import context.dispatcher
        val timeoutMessager = context.system.scheduler.scheduleOnce(250.milliseconds, self, TimeOutMessage)

      }))

    case _ =>
  }
}

class ActorLevelTwo extends Actor{

  println("ActorLevelTwo Starting!")

  def receive = LoggingReceive{
    case alp:String =>
      println(s"Receive $alp, reply a success.")
      sender() ! alp
  }
}