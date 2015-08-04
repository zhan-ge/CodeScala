package CookCode.Traits

// Created by ZG on 15/8/4.
// 

object UsingTraitAsInterface extends App{

}

//带有无参抽象方法的特质
trait BaseSoundPlayer {
  def play
  def close
  def pause
  def stop
  def resume
}
//带有有参抽象方法的特质
trait Dog {
  def speak(whatToSay: String)
  def wagTail(enabled: Boolean)
}

// 继承自一个类或特质时，使用extends
//class Mp3SoundPlayer extends BaseSoundPlayer

// 继承自一个类和多个特质时，类使用extends，特质使用with
//class Foo extends BaseClass with Trait1 with Trait2 { ...

// 继承自多个特质时，第一个使用extends，其他使用with
//class Foo extends Trait1 with Trait2 with Trait3 with Trait4 { ...

// 如果继承一个抽象的特质，必须实现所有抽象方法，否则被视为抽象类