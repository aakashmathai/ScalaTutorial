package chapter05

object OperatorMethods {
  def main(args: Array[String]): Unit = {
    //Both statements below are inferred in same way
    val sum = 1 + 2
    val sum2 = 1.+(2)
    println("Sum = " + sum + "\nSum 2 = " + sum2)

    //Both statements below are inferred in same way
    //Here the indexOf acts as an operator
    val text = "Aakash"
    val index = text.indexOf('k')
    val index2 = text indexOf 'k'
    println("Index = " + index + "\nIndex 2 = " + index2)
  }
}
