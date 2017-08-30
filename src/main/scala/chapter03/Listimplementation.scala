package chapter03

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

    //making list
    val Names = "Aakash" :: "Nikhil" :: "Wilson" :: "Ajay" :: "Vijay" :: "Vishnu" :: Nil

    //element index
    println("Second element of the list : " + Names(2))

    //count with condition
    println("No of elements with length 4 : " + Names.count(s => s.length == 4))

    //dropping elements from left
    println("After dropping two elements : " + Names.drop(2))

    //dropping elements from right
    println("After dropping two elements from right : " + Names.dropRight(2))

    //does exist?
    println("Checking if Aakash exists : " + Names.contains("Aakash"))

    //filter with condition
    println("Elements with length > 5 : " + Names.filter(s => s.length < 5))

    //if all ends with a specific string
    println("Is all elements ending with y : " + Names.forall(s => s.endsWith("y")))

    //printing all
    println("Printing all elements :")
    Names.foreach(s => print(s))
    println()
    Names.foreach(print)
    println()

    //printing head
    println("Printing head : " + Names.head)

    //printing all excluding last
    println("Printing all elements except last : " + Names.init)

    //is empty?
    println("Is the lis empty : " + Names.isEmpty)

    //last element
    println("Last element : " + Names.last)

    //finding length
    println("Length of List : " + Names.length)

    //concatenating string to each
    println("Adding Tykhe : " + Names.map(s => s + " Thyke"))

    //convert to string
    val nameListElements = Names.mkString(", ")
    println("String created using name list : " + nameListElements)

    //remove with condition
    println("Removing elements with 4 letters : " + Names.filterNot(s => s.length == 4))

    //reversing
    println("Reverse list : " + Names.reverse)

    //all except first
    println("Tail of the list : " + Names.tail)

    //sorting
    println("Sorted List : " + Names.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower))
  }
}
