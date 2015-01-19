println("\nBoolean values")
val leapYear = false
!leapYear // ! operator

println("\nAny type and null reference")
var myObject: Any = null
//myObject.getClass  // Produces NullPointerException

myObject = leapYear
myObject.getClass  // MyObject is of Boolean class

myObject = leapYear.toString
myObject.getClass  // MyObject is of String class

var myValue: AnyVal = 5
myValue = 3.14
myValue = false
myValue = 1 to 5

var myReference: AnyRef = 1 to 5
myReference = List(1,3,5)
myReference = "A String"
myReference = 5

println("\nSymbols")
val symbol = 'trueorfalse
symbol == true
symbol == false
symbol == 'trueorfalse
symbol.getClass