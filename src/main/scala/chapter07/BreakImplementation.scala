package chapter07

import java.util._

import scala.util.control.Breaks._

object BreakImplementation {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    breakable {
      while (true) {
        println("?")
        if (scanner.next() == "k") break
      }
    }
  }
}
