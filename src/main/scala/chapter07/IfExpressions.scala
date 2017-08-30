package chapter07

object IfExpressions {
  def main(args: Array[String]): Unit = {
    println("Enter your Marks :")
    val marks = readInt()
    val grade =
      if (marks >= 90) "S"
      else if (marks >= 80) "A"
      else if (marks >= 70) "B"
      else if (marks >= 60) "C"
      else if (marks >= 50) "D"
      else if (marks >= 40) "E"
      else "FAIL"
    println("Grade : " + grade)

  }
}
