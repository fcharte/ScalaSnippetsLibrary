println("\nBoolean values\n")
val leapYear = false
println("leapYear: " + leapYear)
println("!leapYear: " + !leapYear) // ! operator

println("\nAny type and null reference\n")
var myObject: Any = null
println("Variable with null: " + myObject)
println("Accessing null will throw an exception: " + myObject.getClass) // Produces NullPointerException

println("Assigning values to Any variable")
myObject = leapYear
println("Current class: " + myObject.getClass)  // MyObject is of Boolean class

myObject = leapYear.toString
println("Current class: " + myObject.getClass)  // MyObject is of String class

println("\nAnyVal type\n")
var myValue: AnyVal = 5
myValue = 3.14
myValue = false
myValue = 1 to 5

println("\nAnyRef type\n")
var myReference: AnyRef = 1 to 5
myReference = List(1,3,5)
myReference = "A String"
myReference = 5

println("\nSymbols\n")
val symbol = 'trueorfalse
symbol == true
symbol == false
symbol == 'trueorfalse
symbol.getClass