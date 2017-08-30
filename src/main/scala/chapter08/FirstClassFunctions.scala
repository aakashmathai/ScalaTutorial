package chapter08

object FirstClassFunctions {
  def main(args: Array[String]): Unit = {

    //First class function defined as var
    var increase = (x: Int) => x + 1

    //calling thr function
    val i = increase(5)
    println(i)

    //reassigning the function
    increase = (x: Int) => x + 50
    val j = increase(50)
    println(j)

    //Defining the function with more than one statements
    increase = (x: Int) => {
      println("increased 500")
      x + 500
    }
    val k = increase(500)
    println(k)
  }

}
