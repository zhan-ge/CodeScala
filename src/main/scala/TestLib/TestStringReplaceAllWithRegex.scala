package TestLib

// Created by ZG on 15/9/9.
// 

object TestStringReplaceAllWithRegex extends App{

  val s = ",.!，，D_NAME。！；‘’”“《》**dfs  #$%^&()-+1431221中国123漢字かどうかのjavaを決定"
  println(s.replaceAll("，|：|；|,|:|;|、", " "))
  println(s.replaceAll("[\\pP‘’“”]", ""))
  println(s.replaceAll("[\\pS‘’“”]", ""))
  println(s.replaceAll("[\\pP\\pS]", "").trim)

}
