package randoms

import java.util.Scanner

object Calculator {
  def main(args: Array[String]): Unit = {
    print("Enter two Numbers : ")
    val scanner = new Scanner(System.in)
    val No1 = scanner.nextInt()
    val No2 = scanner.nextInt()
    print("Enter the Operation(+ * - /) : ")
    val operator = scanner.next()
    operator match {
      case "+" => println("Sum is : " + (No1 + No2))
      case "-" => println("Difference is : " + (No1 - No2))
      case "*" => println("Product is : " + (No1 * No2))
      case "/" => println("Quotient is : " + (No1 / No2) + "\nReminder is : " + (No1 % No2))
      case _ => println("Enter valid operator")
    }
    scanner.close()
  }
}
