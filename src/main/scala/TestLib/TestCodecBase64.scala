package TestLib

// Created by ZG on 15/9/9.
// 

object TestCodecBase64 extends App{

  //Base64 encoding/decoding functions facilities
  def EncodeBase64( email: String ): String =
    org.apache.commons.codec.binary.Base64.encodeBase64String( email.getBytes )

  def DecodeBase64( encodedUusername: String ): String =
    new String( org.apache.commons.codec.binary.Base64.decodeBase64( encodedUusername ) )

  val str = "Test for Base64 encode/encode."
  println("origin = " + str)
  val encoded = EncodeBase64(str)
  println("encoded = " + encoded)
  val decoded = DecodeBase64(encoded)
  println("decoded = " + decoded)

}
