package CookCode.Objects

// Created by ZG on 15/8/3.
// 

object Introduction extends App{

  println(DateUtils.getCurrentDate)
  println(DateUtils.getCurrentTime)

}

import java.util.Calendar
import java.text.SimpleDateFormat

object DateUtils {
  def getCurrentDate: String = getCurrentDateTime("YYYY-MM-dd HH:mm:ss")

  def getCurrentTime: String = getCurrentDateTime("HH:mm:ss")

  private def getCurrentDateTime(dateTimeFormat: String): String = {
    val dateFormat = new SimpleDateFormat(dateTimeFormat)
    val cal = Calendar.getInstance()
    dateFormat.format(cal.getTime)
  }
}
