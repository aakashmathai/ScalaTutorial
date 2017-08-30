package chapter09

import java.io.File

object FileMatcher {
  def main(args: Array[String]): Unit = {
    println("part One")
    filesEnding(".scala").foreach(println)

    println("part Two")
    filesContaining("Map").foreach(println)

    println("part 3")
    filesRegex("A.*").foreach(println)
  }

  def filesEnding(query: String): Array[File] =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String): Array[File] =
    filesMatching(_.contains(query))

  def filesRegex(query: String): Array[File] =
    filesMatching(_.matches(query))

  private def filesHere = new File("/home/aakash/RandomFiles/").listFiles

  private def filesMatching(matcher: String => Boolean) =
    for (file <- filesHere; if matcher(file.getName))
      yield file
}
