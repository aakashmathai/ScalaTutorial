package chapter6

object RationalImplementation {
  def main(args: Array[String]): Unit = {
    implicit def intToRational(x: Int): Rational = new Rational(x)

    val a = new Rational(6, 8)
    val b = new Rational(2, 8)
    val sum = a + b
    val product = a * 5
    val difference = 4 - b
    val quotient = a / b
    println(sum + "\n" + product + "\n" + difference + "\n" + quotient)
  }

  class Rational(n: Int, d: Int) {
    //making sure that d is never 0
    require(d != 0)

    //dividing with gcd to get simplified form
    private val g = gcd(n.abs, d.abs)
    var numer: Int = n / g
    var denom: Int = d / g


    //overriding toString function so that logical debug messages are made
    override def toString: String = numer + "/" + denom

    //auxiliary constructor for objects with one parameter
    def this(n: Int) = this(n, 1)

    //Basic Mathematical operations
    def +(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom, denom * that.denom
      )

    def -(that: Rational): Rational =
      new Rational(
        numer * that.denom - that.numer * denom, denom * that.denom
      )

    def *(that: Rational): Rational =
      new Rational(
        numer * that.numer, denom * that.denom
      )

    def /(that: Rational): Rational =
      new Rational(
        numer * that.denom, denom * that.numer
      )

    //method to find the gcd for simplification of rationals
    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)
  }

}
