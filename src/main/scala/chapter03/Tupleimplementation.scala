package chapter03

object Tupleimplementation {
  def main(args: Array[String]): Unit = {
    val pair = (99, "Hundred")
    val triplets = ('a', 2, "three")
    println(pair)
    println(triplets)
    println(pair._1)
    val tupleString = triplets.toString()
    println(tupleString)
  }
}
