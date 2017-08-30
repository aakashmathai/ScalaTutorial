package chapter07

import scala.collection.immutable

object FunctionalMultiTable {
  def main(args: Array[String]): Unit = {
    println(multiTable())
  }

  def multiTable(): String = {
    val tableSeq =
      for (row <- 1 to 10)
        yield makeRow(row)
    tableSeq.mkString("\n")
  }

  def makeRow(row: Int): String = makeRowSeq(row).mkString

  def makeRowSeq(row: Int): immutable.IndexedSeq[String] =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
}
