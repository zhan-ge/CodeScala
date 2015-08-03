package CookCode.Method

// Created by ZG on 15/8/3.
// 

object SettingDefaultValuesForMethodParameters extends App{

  val c = new Connection
  c.makeConnection()
  c.makeConnection(6000)
  c.makeConnection(protocol="https")
  c.makeConnection(timeout = 1000, protocol="ftp")
  c.makeConnection(3000, "https")

}


class Connection {
  def makeConnection(timeout: Int = 5000, protocol: String = "http") {
    println("timeout = %d, protocol = %s".format(timeout, protocol))
    // more code here
  }
}