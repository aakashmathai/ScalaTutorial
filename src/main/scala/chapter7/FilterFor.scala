package chapter7

object FilterFor {
  def main(args: Array[String]): Unit = {
    val filesHere = new java.io.File("/home/aakash/RandomFiles").listFiles()
    for (file <- filesHere if file.getName.endsWith(".scala"))
      println(file)
  }
}
