package chapter7

import java.net.{MalformedURLException, URL}

object CatchYields {
  def main(args: Array[String]): Unit = {

    println(UrlFor("https://www.facebook.com"))
  }

  def UrlFor(path: String): URL =
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException => new URL("https://www.google.com")
    }
}
