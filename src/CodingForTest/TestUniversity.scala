
// Created by ZG on 15/7/12.
// 

object TestUniversity extends App{

  println("University.updateNo() = " + University.updateNo())
  println("University.updateNo() = " + University.updateNo())

  val uni = new University
  println("uni.id = " + uni.id)
  println("uni.id = " + uni.id)

}

// (object University单独存在时)单例对象，用作静态方法或者公共变量
object University{            // 在第一次调用时调用默认构造器
  private var studentNo = 0
  def updateNo() = {
    studentNo += 1
    studentNo
  }
}

// 如果同时有一个University类，则object University是class University伴生对象，类中可以访问伴生对象的所有属性，包括私有属性
class University{
  val id = University.updateNo()
  private var number = 0
  def aClass(number:Int): Unit ={
    this.number += number
  }
}