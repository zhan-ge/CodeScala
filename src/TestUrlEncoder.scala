
// Created by ZG on 15/7/20.
// 

object TestUrlEncoder extends App{

  val exampleText = "苹果发布会"
  val urlEncoded = java.net.URLEncoder.encode(exampleText, "utf-8")
  println("urlEncoded = " + urlEncoded)
  println(s"http://www.baidu.com?search=$urlEncoded")
//  urlEncoded = %E8%8B%B9%E6%9E%9C%E5%8F%91%E5%B8%83%E4%BC%9A
//  http://www.baidu.com?search=%E8%8B%B9%E6%9E%9C%E5%8F%91%E5%B8%83%E4%BC%9A

//  val url = new java.net.URL("http://spotlight.dbpedia.org/rest/annotate")
//  val data = "text=" + urlEncoded + "&support=10&confidence=0.2"

//  val conn = url.openConnection
//  conn.setDoOutput(true)
//  val out = new java.io.OutputStreamWriter(conn.getOutputStream)
//  out.write(data)
//  out.flush
//  out.close
//
//  val in = conn.getInputStream()
//  println(io.Source.fromInputStream(in).mkString(""))
//  in.close

}
