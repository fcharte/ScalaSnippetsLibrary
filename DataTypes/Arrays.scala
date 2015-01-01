println("\nDeclaring an array with explicit data type")
val basicArray: Array[Int] = new Array[Int](12) // The array has 12 empty elements
println("\nDeclaring an array with inferred data type")
val basicArray2 = new Array[Int](12)  // The same
val basicArray3 = Array.ofDim[Int](12) // The same

println("\nDeclaring an empty array (without items) of integers")
val emptyArray1 = Array.empty[Int]
val emptyArray2 = Array.emptyIntArray // The same

println("\nDeclaring an array with a sequence of values and inferred data type")
val daysMonth = Array(31, 28, 31, 30, 31, 30)

println("\nDeclaring arrays as a range of items")
val months = Array.range(1, 13)
val evenNumbers = Array.range(2, 100, 2)
println("\nFilling the items of a new array")
import scala.util.Random
val randomN = Array.fill(10){Random.nextInt(50)}

println("\nCalculating the item values in a new array")
// Generates de sequence 1, 3, 5, 7 ...
val sequence = Array.tabulate(10)(_*2+1)

println("\nDeclaring a multidimensional array")
// Array with three items of type Array[Int]
val holidays = Array(
  Array(1, 4, 6, 11, 18, 25),
  Array(1, 8, 15, 22, 28),
  Array(1, 8, 15, 19, 22, 29)
)
println("\nAnother way for creating multidimensional arrays")
// Array for storing 10 appointments each month
val appointments = Array.ofDim[String](12, 10)

println("\nFilling the items in a multidimensional array")
// 2+3X+2Y, with X in [0,2] and Y in [0,3]
val points = Array.tabulate(3,4)(2+3*_+2*_)

println("\nGetting number of items in array")
evenNumbers.length
appointments.length
appointments(1).length

println("\nAccessing the elements of the array")
// Scala arrays are zero based
basicArray(0) = 31
basicArray(2) = daysMonth(1) / 2
basicArray(2)
println("\nConcatenating arrays")
val everything = Array.concat(daysMonth, months)

println("\nAccessing elements in a multidimensional array")
// First appointment of June
appointments(5)(1) = "Driving test"
appointments(5)
holidays(0)
holidays(1)(4)
