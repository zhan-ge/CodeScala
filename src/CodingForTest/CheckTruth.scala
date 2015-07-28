
// Created by ZG on 15/7/8.
// 

object CheckTruth {
  def main(args: Array[String]) {

    println("checkTrue(true || false, true) = " + checkTrue(true||false, true))
    println("1>0 && -1<0, 1==2 = " + (1 > 0 && -1 < 0, 1 == 2))
    println("(1>=2, 1>=1) = " +(1 >= 2, 1 >= 1))

  }

  def checkTrue(exp1:Boolean, exp2:Boolean): String = {

    if(exp1 && exp2){
      "Both are true!"
    }
    else if(!exp1 && !exp2){
      "Both are false!"
    }
    else if(exp1){
      "First true, second false!"
    }
    else {
      "First false, second true!"
    }

  }

}
