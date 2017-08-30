package chapter07

object ForLoop {
  def main(args: Array[String]): Unit = {

    //Loop over the file names
    val filesHere = new java.io.File("./src/main/scala").listFiles()
    for (file <- filesHere)
      println(file)

    //Loop over digits including upper limit
    for (i <- 1 to 10)
      print(i + " ")
    println()

    //Loop over digits till upper limit
    for (i <- 1 until 10)
      print(i + " ")
  }
}
