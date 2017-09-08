package HackerRank

object CountingValley {

  def main(args: Array[String]) {
    val in = new java.util.Scanner(System.in)
    val n = in.nextInt()
    val str = in.next()
    var level = 0
    var count = 0
    for (i <- 0 until n) {
      if (str.charAt(i) == 'U') {
        level += 1
        if (i != 0)
          if (level == 0 && str.charAt(i) == 'U')
            count += 1

      }
      else {
        level -= 1
      }
    }
    println(count)
  }
}
