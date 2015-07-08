
// Created by ZG on 15/7/8.
// 

object Family {
  def main(args: Array[String]) {
    new Family(mom="Mom", dad="Dad")
    //new Family(dad="Dad", mom="Mom") doesn't work

    new Family(mom="Mom", dad="Dad", kids="Sammy", "Bobby")
    //new Family(dad="Dad", mom="Mom", kids="Sammy", "Bobby") doesn't work

  }
}

class Family(mom:String, dad:String, kids:String*)