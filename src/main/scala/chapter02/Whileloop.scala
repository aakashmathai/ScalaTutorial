package chapter02

object Whileloop {
  def main(args: Array[String]): Unit = {
    var i: Int = 15
    while (i > 0) {
      println(i)
      i -= 1
    }
  }
}
