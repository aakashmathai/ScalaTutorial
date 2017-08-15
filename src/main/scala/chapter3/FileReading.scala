package chapter3

import scala.io.Source

object FileReading {
  def main(args: Array[String]): Unit = {
    val textPath = readLine("Enter the path of the text file")

    //Getting the lines of text in file and storing them as a List called lines
    val lines = Source.fromFile(textPath).getLines().toList

    //Finding the longest line
    val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)

    //calculating maximum width required
    val maxWidth = widthOfLength(longestLine)

    //printing each of the lines after setting the required padding
    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length + " | " + line)
    }
  }

  //Function to find length
  def widthOfLength(s: String): Int = s.length.toString.length
}
