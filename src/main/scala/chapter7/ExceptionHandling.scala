package chapter7

object ExceptionHandling {
  def main(args: Array[String]): Unit = {
    println("Enter a number :")
    val n = readInt()
    val half =
      if (n % 2 == 0) n / 2
      else throw new RuntimeException("input must be Even")
    println("half is : " + half)
  }
}
