package chapter03

object Setimplementation {
  def main(args: Array[String]): Unit = {
    //Set declaration and Initialisation
    val indiaAirWay_Set = Set("Air India", "Indian Airlines", "Indigo")
    var airWay_Set = Set("Qatar Airways", "Air India", "Indian Airlines", "Spicejet")
    airWay_Set += "Kingfisher"
    println(airWay_Set)
    airWay_Set -= "Kingfisher"
    println(airWay_Set)

    //checking content
    println("The Set contains Air India? :" + airWay_Set.contains("Air India"))

    //elements common to both sets
    val airwayIntersection = indiaAirWay_Set & airWay_Set

    // elements only in India
    val onlyIndian = indiaAirWay_Set &~ airWay_Set
    println(onlyIndian)
    println(airwayIntersection)

    //convert elements to Strings
    val airwayString = airWay_Set.mkString(",")
    println(airwayString)
  }
}
