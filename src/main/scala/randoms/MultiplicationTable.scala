package randoms

import java.util.Scanner

object MultiplicationTable {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    println("Enter the number")
    val n = scanner.nextInt()
    println("Enter the Limit : ")
    val l = scanner.nextInt()
    for (i <- 1 to l) {
      println(n + " x " + i + " = " + (n * i))
    }
    scanner.close()
  }
}
