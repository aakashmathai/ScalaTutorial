package chapter4

object ClassImplementation {

  def main(args: Array[String]): Unit = {

    //creating an object array
    var obj = new Array[StudentDetails](3)
    obj(0) = new StudentDetails
    obj(1) = new StudentDetails
    obj(2) = new StudentDetails

    ////initializing objects with values
    obj(0).addDetails("Aakash", 22, "XII")
    obj(1).addDetails("Nikhil", 22, "X")
    obj(2).addDetails("Aayush", 13, "VIII")

    //Printing all the objects
    for (i <- 0 to 2) {
      obj(i).printDetails()
      println("***********************************")
    }

  }

  //Class definition
  class StudentDetails {
    private var name = "xyz"
    private var age = 0
    private var std = "xxx"

    //Method to Print
    def printDetails(): Unit = {
      println("Name : " + name)
      println("Age : " + age)
      println("Class : " + std)
    }

    //Method to Add Details
    def addDetails(x: String, y: Int, z: String): Unit = {
      name = x
      age = y
      std = z
    }
  }

}
