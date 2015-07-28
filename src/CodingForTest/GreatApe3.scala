
// Created by ZG on 15/7/11.
// 

object GreatApe3 {

  def talk(ape: GreatApe) = {
    // ape.run()      // not an ape method
    // ape.jump       // nor this
//    ape.climb(4)
//    ape.call + ape.eat()
  }
}

class GreatApe3{
  def call = "Hoo!"
  var energy = 3
  def eat() = {
    energy += 10
    energy
  }
  def climb(x:Int) ={
    energy -= x
  }
}

class Bonobo1 extends GreatApe3 {
  override def call = "Eep!"
  // modify the base-class var:
  energy = 5
  // call the base-class version
  override def eat() = super.eat() * 2
  // add new method
  def run() = "Bonobo runs"
}

class Chimpanzee1 extends GreatApe3 {
  override def call  = "Yawp!"
  override def eat() = super.eat() * 3
  def jump = "Chimp jumps"
  val kind = "Common" // new field
}