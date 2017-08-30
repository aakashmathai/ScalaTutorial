package chapter07

import java.io.{FileNotFoundException, FileReader, IOException}

object TryCatchFinally {
  def main(args: Array[String]): Unit = {

    try {
      val file = new FileReader("/home/aakash/RandomFiles/textbook.txt")
      println("file open")
      var data = file.read()
      while (data != -1) {
        print(data.toChar)
        data = file.read()
      }
    } catch {
      case ex: FileNotFoundException => println("File does not exist")
      case ex: IOException => println("IO error")
    } finally {

      println("Printing file over")
    }

  }
}
