package chapter3

import scala.io.Source

object FileReading {
  def main(args: Array[String]): Unit = {
    val textPath = readLine("Enter the path of the text file")
    val lines = Source.fromFile(textPath).getLines().toList
    val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
    val maxWidth = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length + " | " + line)
    }
  }

  def widthOfLength(s: String) = s.length.toString.length
}
