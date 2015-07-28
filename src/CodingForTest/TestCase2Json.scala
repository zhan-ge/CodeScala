
// Created by ZG on 15/7/16.
//

import spray.json._
import DefaultJsonProtocol._


object TestCase2Json extends App{

  case class CoursePhoto(photoId: Long, photoNmae:String)
  case class CoursePhotoEmber(coursePhoto: CoursePhoto)

  implicit val jsonFormatCoursePhoto = jsonFormat2(CoursePhoto)
  implicit val jsonFormatCoursePhotoEmber = jsonFormat1(CoursePhotoEmber)

  val ember = """{ "coursePhoto": { "photoId": 1 , "photoNmae": "Beauty"} }""".parseJson.convertTo[CoursePhotoEmber]
  println("ember = " + ember)
  println("ember = " + ember.toJson)
}

