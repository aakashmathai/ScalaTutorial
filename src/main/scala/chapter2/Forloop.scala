package chapter2

object Forloop {
  def main(args: Array[String]): Unit = {
    var arr = Array("zero","one","two")
    arr.foreach(arg=>println(arg))
    arr.foreach(println)
    for(arg<-arr)
      println(arg)
  }
}
