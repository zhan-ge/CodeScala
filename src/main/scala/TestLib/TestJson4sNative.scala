package TestLib

// Created by ZG on 15/9/9.
//

import org.json4s._
import org.json4s.JsonDSL._
import org.json4s.native.JsonMethods._

object TestJson4sNative extends App{

  // Parse json from string
  println(parse(""" { "numbers" : [1, 2, 3, 4] } """))
  println(parse("""{"name":"Toy","price":35.35}""", useBigDecimalForDouble = true))

  // Querying JSON
  val json1 = parse("""{ "name": "joe","children": [{"name": "Mary","age": 5},{"name": "Mazy","age": 3}]}""")
  val ages =for {
    JObject(child) <- json1
    JField("age", JInt(age))  <- child
  } yield age
  println(ages)

  // Querying JSON with filter
  val ch = for {
    JObject(child) <- json1
    JField("name", JString(name)) <- child
    JField("age", JInt(age)) <- child
    if age > 4
  } yield (name, age)
  println(ch)

  // Query with path
  val json2 = parse("""
         { "name": "joe",
           "children": [
             {
               "name": "Mary",
               "age": 5
             },
             {
               "name": "Mazy",
               "age": 3
             }
           ]
         }
                    """)

  val spouse = json2 \\ "children"
  println(spouse)

  val mazyAge = json2.findField{
    case JField("name", _) => true
    case _ => false
  }
  println(mazyAge)
  println((json2 \ "children")(0) \ "name")

  // Extracting values
  implicit val formats = DefaultFormats // Brings in default date formats etc.
  case class Child(name: String, age: Int, birthdate: Option[java.util.Date])
  case class Address(street: String, city: String)
  case class Person(name: String, address: Address, children: List[Child])
  val json3 = parse("""
         { "name": "joe",
           "address": {
             "street": "Bulevard",
             "city": "Helsinki"
           },
           "children": [
             {
               "name": "Mary",
               "age": 5,
               "birthdate": "2004-09-04T18:06:22Z"
             },
             {
               "name": "Mazy",
               "age": 3
             }
           ]
         }
                    """)
  val person = json3.extract[Person]
  println(person)

  val addressJson = json3  \ "address"  // Extract address object
  val add = addressJson.extract[Address]
  println(add)

  import org.json4s.native.Serialization
  import org.json4s.native.Serialization.{read, write}
  implicit val formats1 = Serialization.formats(NoTypeHints)
  val ser = write(Child("Mary", 5, None))
  println(ser)
  println(read[Child](ser))

}
