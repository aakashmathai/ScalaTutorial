package chapter7

object VariableScope {
  def main(args: Array[String]): Unit = {
    printMultiTable()
  }

  def printMultiTable(): Unit = {
    var i = 1
    //in scope : i
    while (i <= 10) {
      var j = 1
      //in scope: i j
      while (j <= 10) {
        val prod = (i * j).toString
        //in scope: i j prod
        var k = prod.length
        //in scope: i j prod k
        while (k < 4) {
          print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }
      //in scope: i j
      println()
      i += 1
    }
    //in scope: i
  }
}
