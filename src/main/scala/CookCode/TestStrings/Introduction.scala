package CookCode.TestStrings

// Created by ZG on 15/7/28.
// 

object Introduction extends App{

  // scala中的String其实是java的String，在REPL中定义一个String时会回显其类型为java.lang.String.
  // 因此可以使用所有java.lang.String的方法。

  val newStr = "hello world!"
  println("newStr.className = " + newStr.getClass.getName)      // java.lang.String
  println("newStr.length = " + newStr.length)

  newStr.foreach(println)
  for(c <- newStr) print(c)
  newStr.getBytes.foreach(println)

  val newStrWithOutL = newStr.filter(_!='l')
  println("newStrWithOutL = " + newStrWithOutL)

  println("newStr = " + newStr.drop(2).take(2).capitalize)
  println("newStr = " + newStr.slice(2, 4).capitalize)

}
