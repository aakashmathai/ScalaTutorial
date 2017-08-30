package chapter03

import scala.collection.mutable

object Mapimplementation {
  def main(args: Array[String]): Unit = {
    val roman = mutable.Map[Int, String]() //Map declaration

    //Map Initialization
    roman += (1 -> "I")
    roman += (2 -> "II")
    roman += (3 -> "III")
    roman += (4 -> "IV")
    roman += (5 -> "V")

    println("Map : " + roman)
    println("Keys : " + roman.keys) //Map keys
    println("Values : " + roman.values) //Map values
    println("Is the map empty : " + roman.isEmpty) //isEmpty?

    //Another initialization
    val roman2 = mutable.Map(6 -> "VI", 7 -> "VII", 8 -> "VIII", 9 -> "IX", 10 -> "X")

    //Concat 2 Maps
    val romanFull = roman ++ roman2
    println(romanFull)
  }
}
