package chapter07

import java.io.File

object NestedIterationsFor {
  def main(args: Array[String]): Unit = {

    //location of the files
    val filesHere = new File("/home/aakash/RandomFiles").listFiles()

    //adding lines in a file to a list
    def fileLines(file: java.io.File) =
      scala.io.Source.fromFile(file).getLines().toList

    //method to find the lines containing a specific pattern
    def grep(pattern: String): Unit =
      for {
        file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(pattern)
      } println(file + " : " + trimmed)

    grep(".*val .*")
  }
}
