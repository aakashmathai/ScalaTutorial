package chapter05

object Unicode {
  def main(args: Array[String]): Unit = {
    //unicode can be used anywhere in scala program
    val a = '\u0041'
    println(a)

    /*It can also be used for keywords also
    \u0076\u0061\u0072\u0020\u0041\u003d\u0030  is the unicode for var A=0
    */

    //Other special literals
    println("Line feed : Hi\nWorld")
    println("Backspace : Hi\bWorld")
    println("Tab : Hi\tWorld")
    println("Form Feed : Hi\fWorld")
    println("Carriage Return : Hi\rWorld")
    println("Double Quote : Hi\"World")
    println("Single Quote : Hi\'World")
    println("Backslash : Hi\\World")
  }
}
