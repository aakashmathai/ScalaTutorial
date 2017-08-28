package chapter34

import scala.swing._
import scala.swing.event._

object Temperature extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "Temperature"
    val textC = new TextField(columns = 5)
    val textF = new TextField(columns = 5)
    contents = new FlowPanel {
      contents += textC
      contents += new Label("Celsius      ")
      contents += textF
      contents += new Label("Fahrenheit")
      border = Swing.EmptyBorder(30, 30, 10, 30)
    }
    listenTo(textF, textC)
    reactions += {
      case EditDone(`textC`) =>
        val c = textC.text.toInt
        val f = (c * 9 / 5) + 32
        textF.text = f.toString
      case EditDone(`textF`) =>
        val f = textF.text.toInt
        val c = (f - 32) * 5 / 9
        textC.text = c.toString
    }
  }
}
