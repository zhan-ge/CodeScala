import java.net.URL
import scala.util.parsing.combinator.RegexParsers

// Created by ZG on 15/7/20.
// 

object IdempotentURLEncoder extends RegexParsers {
  override def skipWhitespace = false
  private def segment = rep(char)
  private def char = unreserved | escape | any ^^ { java.net.URLEncoder.encode(_, "UTF-8") }
  private def unreserved = """[A-Za-z0-9._~!$&'()*+,;=:@-]""".r
  private def escape = """%[A-Fa-f0-9]{2}""".r
  private def any = """.""".r
  private def encodeSegment(input: String): String = parseAll(segment, input).get.mkString
  private def encodeSearch(input: String): String = encodeSegment(input)
  def encode(url: String): String = {
    val u = new URL(url)
    val path = u.getPath.split("/", -1).map(encodeSegment).mkString("/")
    val query = u.getQuery match {
      case null      => ""
      case q: String => "?" + encodeSearch(q)
    }
    val hash = u.getRef match {
      case null      => ""
      case h: String => "#" + encodeSegment(h)
    }
    s"${u.getProtocol}://${u.getAuthority}$path$query$hash"
  }
}