package chapter34

import scala.swing._
import scala.swing.event._

object ButtonClicks extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "Button Clicks!!"
    val button = new Button("Click Me")
    val label = new Label("No Button Clicks")
    contents = new BoxPanel(orientation = Orientation.Vertical) {
      contents += button
      contents += label
      border = Swing.EmptyBorder(30, 30, 10, 30)
    }
    listenTo(button)
    var nClicks = 0
    reactions += {
      case ButtonClicked(b) =>
        nClicks += 1
        label.text_=("No of Clicks : " + nClicks)
    }
  }
}
