println("\nVariable declaration\n")

println("\nInferring the data type needs initialization")
var aNumber = 3.1415927

println("\nThe data type can be also specified")
var anotherNumber: Int = 5

println("\nVariables can be declared without initialization in some contexts")
var aValue: String = null

println("\nThe values in a 'var' can change")
aNumber = (1 + Math.sqrt(5)) / 2

println("\nThe values in a 'val' cannot be changed once initialized")
val pi: Double = 3.1415927
pi = aNumber // This will throw an error

println("\nSeveral variables can be initialized at once")
val (daysJan, daysFeb) = (31, 28)   // With different values
val daysMarch, daysJul = 31         // With the same value
