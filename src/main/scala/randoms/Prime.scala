package randoms

import java.util.Scanner

object Prime {
  def main(args: Array[String]): Unit = {
    val in = new Scanner(System.in)
    println("Enter The Number :")
    val no = in.nextInt()
    var isPrime = true
    for (i <- 2 to no / 2) {
      if (no % i == 0) isPrime = false
    }

    if (isPrime) println("Prime")
    else println("Not Prime")


  }
}
