package CookCode.TestStrings

// Created by ZG on 15/7/29.
// 

object AccessingACharacterInAString extends App{

  println("\"hello\".charAt(0) = " +"hello".charAt(0))

  println("\"hello\"(0) = " +"hello"(0))

  // in fact
  println("\"hello\".apply(1) = " +"hello".apply(1))
}
