package ProgrammingScala2Ed.Implicits

// Created by ZG on 15/8/25.
//




object ConvertToJson {

  case class Address(street:String, city:String)
  case class Person(name:String, address: Address)

  trait ToJSON{
    def ToJSON(level:Int=0):String

    val INDENTATION = "  "
    def indentation(level:Int=0):(String, String) =
      (INDENTATION * level, INDENTATION * (level + 1))
  }

  implicit class AddressToJson(address:Address) extends ToJSON{
    def ToJSON(level:Int=0):String = {
      val (outdent, indent) = indentation(level)
      s"""{
         |$indent"street": "${address.street}",
         |$indent"city":   "${address.city}"
         |$outdent}""".stripMargin
    }
  }

  implicit class PersonToJSON(person: Person) extends ToJSON {
    def ToJSON(level:Int=0):String = {
      val (outdent, indent) = indentation(level)
      s"""{
         |$indent"name":    "${person.name}",
         |$indent"address": ${person.address.ToJSON(level + 1)}
         |$outdent}""".stripMargin
    }
  }

  def test() = {
    val a = Address("1 Scala Lane", "Anytown")
    val p = Person("Buck Trends", a)
    println("a.toJson = " + a)
  }
}

object TestImplicitsToJsonTypeClass extends App{

  import ConvertToJson._

  test()

}



