package TestLib

// Created by ZG on 15/9/6.
//

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.remote.DesiredCapabilities

object TestSeleniumHtmlUnitDriver extends App{

  val api = "http://www.aaaa.c"

  val capabilities:DesiredCapabilities = DesiredCapabilities.htmlUnit()
  capabilities.setBrowserName("Mozilla/5.0 (Linux; U; Android 4.3; en-us; SM-N900T Build/JSS15J)")
  capabilities.setVersion("4.0")
  capabilities.setJavascriptEnabled(false)
  val driver:WebDriver = new HtmlUnitDriver(capabilities)

  driver.get(api)
  driver.findElement(By.name("mobile")).sendKeys("username")
  driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("password")
  driver.findElement(By.name("submit")).click()

  val cookies = driver.manage().getCookies

  println("cookies = " + cookies)
}
