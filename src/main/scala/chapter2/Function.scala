package chapter2

import java.util.Scanner

object Function {
  def main(args: Array[String]): Unit = {
    println("Enter two numbers")
    val scanner = new Scanner(System.in)
    val i = scanner.nextInt()
    val j = scanner.nextInt()
    println("the greater number is : " + max(i, j))
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }
}
