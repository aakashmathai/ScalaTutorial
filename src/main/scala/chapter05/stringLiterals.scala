package chapter05

object stringLiterals {
  def main(args: Array[String]): Unit = {

    //Printing Raw String
    println(
      """Welcome to INDIA
          Have a Nice Day
    """)

    //Raw string using stripMargin
    println(
      """Welcome to India
        |Have a nice stay
      """.stripMargin)
  }
}
