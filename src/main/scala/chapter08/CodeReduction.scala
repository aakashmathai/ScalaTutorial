package chapter08

object CodeReduction {
  def main(args: Array[String]): Unit = {
    val nos = List(-11, 10, -2, 5, 25, -32, 55)

    //filtering the list
    println(nos.filter((x: Int) => x > 0))

    //target typing in the filter
    println(nos.filter(x => x > 0))

    //using _ instead of variable(placeholder syntax)
    println(nos.filter(_ > 0))

    //Type is necessary if the compiler cant infer it from code
    val f = (_: Int) + (_: Int)
    println(f(5, 15))
  }
}
