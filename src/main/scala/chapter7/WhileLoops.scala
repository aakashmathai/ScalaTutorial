package chapter7

object WhileLoops {
  def main(args: Array[String]): Unit = {
    var line = ""
    do {
      line = readLine()
      println("Read : " + line)
    } while (line != "")
  }
}
