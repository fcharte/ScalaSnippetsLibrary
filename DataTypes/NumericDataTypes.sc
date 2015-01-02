println("\nInteger data types\n------------------")

println("\nByte: [" + Byte.MinValue + ", " + Byte.MaxValue + "]")
println("\nShort: [" + Short.MinValue + ", " + Short.MaxValue + "]")
println("\nInt: [" + Int.MinValue + ", " + Int.MaxValue + "]")
println("\nLong: [" + Long.MinValue + ", " + Long.MaxValue + "]")

println("\nFloating data types\n------------------")

println("\nFloat: [" + Float.MinValue +
  ", " + Float.MaxValue +
  ", " + Float.MinPositiveValue + "]")
println("\nDouble: [" + Double.MinValue +
  ", " + Double.MaxValue +
  ", " + Double.MinPositiveValue + "]")

println("\nVariable declaration/initialization\n-----------------------------------")

println("\nThe type can be inferred from the assigned value")
val year = 2015 // Type Int inferred from value

println("\nThe type can be explicitly stated in the variable declaration")
val next: Short = 2016 // Explicit type

println("\nOr in the literal value with the proper suffix")
val leap = 2030L // Type explicitly stated in the literal value

println("\nFloating point variables default to Double")
val pi = 3.1415927 // Floating point defaults to Double

println("\nFloat type can be indicated by the proper suffix")
val golden = 1.618033f // Type explicitly stated in the literal value

println("\nThe explicit type must coincide with de suffix")
val radius: Float = 2.5f // Explicit type needs same type literal

println("\nAll variables, whether val or var, must be initialized")
var day: Byte = 0 // All variables need to be initialized

println("\nvar variables can change their values at any time")
day = 18 // Changing the value of a integer var
val circumference = 2 * pi * radius

println("\nGetting data type information\n-----------------------------")

println("\nObtaining the class of a variable")
year.getClass

println("\nChecking if a variable corresponds to a certain data type")
year.isInstanceOf[Short]

println("\nAssigning Int to Byte produces 'Type mismatch' error")
var num: Byte = year

println("\nExplicit conversions are available")
val yearAsLong = year.toLong
val yearAsFloat = year.toFloat
val intCircum = circumference.toInt // Loss of data

println("\nAlternative syntax for explicit conversions")
val floatCircum = circumference.asInstanceOf[Float]