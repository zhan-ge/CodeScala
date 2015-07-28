import com.sun.javafx.css.FontUnits.Weight

// Created by ZG on 15/7/11.
// 

object GreatApe {

  def display(ape: GreatApe) = {
    s"Weight: ${ape.weight} age: ${ape.age}})"
  }

  def main(args: Array[String]) {
    println("display(new GreatApe) = " + display(new GreatApe(11.2, 2)))
    println("display(new Bonobo) = " + display(new Bonobo(12.9, 5)))
    println("display(new Chimpanzee) = " + display(new Chimpanzee(1123.1, 22)))
    println("display(new BonoboB) = " + display(new BonoboB(992.2, 11)))
  }

}

class GreatApe(val weight:Double, val age:Int)

class Bonobo(weight:Double, age:Int) extends GreatApe(weight, age)
class Chimpanzee(weight:Double, age:Int) extends GreatApe(weight, age)
class BonoboB(weight:Double, age:Int) extends Bonobo(weight, age)