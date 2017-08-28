package chapter34

import scala.swing._

object WindowedApp extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "First Window"
    contents = new Button {
      text = "Click Me"
    }
  }
}
