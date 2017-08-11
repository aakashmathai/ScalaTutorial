package chapter3

object Listimplementation {
  def main(args: Array[String]): Unit = {
    //List Initialization
    val oneTwoThree = List(1, 2, 3)
    println(oneTwoThree)

    //concatenation of list using :::
    val fourFiveSix = List(4, 5, 6)
    val oneToSix = oneTwoThree ::: fourFiveSix
    println(oneToSix)

    //adding new element using 'cons' (::) operator
    val zeroToSix = 0 :: oneToSix
    println(zeroToSix)

    //list creation and initialization using :: operator and Nil
    val evenFive = 2 :: 4 :: 6 :: 8 :: 10 :: Nil
    println(evenFive)

    //Methods on List
    val Names = "Aakash" :: "Nikhil" :: "Wilson" :: "Ajay" :: "Vijay" :: "Vishnu" :: Nil //making list
    println("Second element of the list : " + Names(2)) //element index
    println("No of elements with length 4 : " + Names.count(s => s.length == 4)) //count with condition
    println("After dropping two elements : " + Names.drop(2)) //dropping elements from left
    println("After dropping two elements from right : " + Names.dropRight(2)) //dropping elements from right
    println("Checking if Aakash exists : " + Names.contains("Aakash")) //does exist?
    println("Elements with length > 5 : " + Names.filter(s => s.length < 5)) //filter with condition
    println("Is all elements ending with y : " + Names.forall(s => s.endsWith("y"))) //if all ends with a specific string
    println("Printing all elements :") //printing all
    Names.foreach(s => print(s))
    println()
    Names.foreach(print)
    println()
    println("Printing head : " + Names.head) //printing head
    println("Printing all elements except last : " + Names.init) //printing all excluding last
    println("Is the lis empty : " + Names.isEmpty) //is empty?
    println("Last element : " + Names.last) //last element
    println("Length of List : " + Names.length) //finding length
    println("Adding Tykhe : " + Names.map(s => s + " Thyke")) //concatenating string to each
    val nameListElements = Names.mkString(", ") //convert to string
    println("String created using name list : " + nameListElements)
    println("Removing elements with 4 letters : " + Names.filterNot(s => s.length == 4)) //remove with condition
    println("Reverse list : " + Names.reverse) //reversing
    println("Tail of the list : " + Names.tail) //all except first
    println("Sorted List : " + Names.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower)) //sorting
  }
}
