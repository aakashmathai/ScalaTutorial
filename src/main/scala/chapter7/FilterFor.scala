package chapter7

import java.io.File

object FilterFor {
  def main(args: Array[String]): Unit = {
    val filesHere = new File("/home/aakash/RandomFiles").listFiles()
    for (file <- filesHere if file.getName.endsWith(".scala"))
      println(file)
  }
}
