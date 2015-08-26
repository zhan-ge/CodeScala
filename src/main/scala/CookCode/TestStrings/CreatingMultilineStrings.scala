package CookCode.TestStrings

// Created by ZG on 15/7/28.
// 多行字符串输出

object CreatingMultilineStrings extends App{

  val foo =
    """This is
      #a multiline
      #String""".stripMargin('#')
  println(foo)

  val speech = """Four score and
                 |seven years ago
                 |our fathers""".stripMargin.replaceAll("\n", " ")
  println(speech)

  val s = """This is known as a
            |"multiline" string
            |or 'heredoc' syntax.""". stripMargin.replaceAll("\n", " ")
  println(s)

}
