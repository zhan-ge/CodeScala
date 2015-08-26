package CookCode.ClassesAndProperties

// Created by ZG on 15/8/2.
//
// There are two main reasons to use an abstract class in Scala:
//  • You want to create a base class that requires constructor arguments.特质不允许构造器参数。
//  • The code will be called from Java code.

object WhenToUseAnAbstractClass {

}

//abstract class BaseController(db: Database) {
//  def save() { db.save }
//  def update() { db.update }
//  def delete() { db.delete }
//  // abstract
//  def connect()
//  // an abstract method that returns a String
//  def getStatus: String
//  // an abstract method that takes a parameter
//  def setServerName(serverName: String)
//}
