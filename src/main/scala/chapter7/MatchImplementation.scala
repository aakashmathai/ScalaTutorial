package chapter7

import java.util.Scanner

object MatchImplementation {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    println("Enter the choice (salt, chips, eggs) : ")
    val userinput = scanner.next()
    userinput match {
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ => println("huh?")
    }

    val sidedish =
      userinput match {
        case "salt" => "water"
        case "chips" => "juice"
        case "eggs" => "tea"
        case _ => "what?"
      }

    println(sidedish)
  }
}
