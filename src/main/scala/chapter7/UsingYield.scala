package chapter7

import java.io.File

object UsingYield {
  def main(args: Array[String]): Unit = {
    val filesHere = new File("/home/aakash/RandomFiles").listFiles()

    //adding lines in a file to a list
    def fileLines(file: java.io.File) =
      scala.io.Source.fromFile(file).getLines().toList

    //using yield keyword to store iteration values
    val lineLengths =
      for {
        file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(".*List.*")
      } yield {
        println(trimmed)
        trimmed.length
      }

    //printing the array of lengths
    for (i <- lineLengths.indices)
      println(lineLengths(i))
  }
}
