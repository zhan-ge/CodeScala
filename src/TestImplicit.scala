import java.util.{Date, Calendar}

// Created by ZG on 15/7/16.
// 

object TestImplicit extends App{

  // 只要该方法在当前范围内存在（通过当前import可见或是位于当前文件）
  // scala就会自动调用它，将int转换为DateHelper实例然后调用days方法
  implicit def convertInt2DateHelper(number:Int): DateHelper = new DateHelper(number)

  val past = 2 days "ago"     // Int型的2并没有days方法,根据上面已定义的隐式装换，将int转换为一个DateHelper类的实例，拥有days方法
  println("past = " + past)

}

class DateHelper(number:Int){
  def days(when:String):Date = {
    val date = Calendar.getInstance()
    when match {
      case "ago" => date.add(Calendar.DAY_OF_MONTH, -number)
      case "from_now" => date.add(Calendar.DAY_OF_MONTH,number)
      case _ =>
    }
    date.getTime
  }
}
