
// Scala collections come in three flavours, held in scala.collection.mutable, scala.collection.immutable and scala.collection.generic
// By default immutable collection are used. If you need to use mutable ones, add 'import scala.collection.mutable' at the beginning

import scala.collection.immutable._

println("\nInitializing collections\n")

println("A list is a sequential access collection")
val aList = List(1, 2, 3, 5, 7, 11, 13)
aList.getClass

println("A vector is an indexed access collection")
val aVector = Vector(1, 2, 3, 5, 7, 11, 13)

println("A queue is a fifo data structure")
val aQueue = Queue("first", "second", "third")

println("A stack is a lifo data structure")
val aStack = Stack("third", "second", "first")

println("A map is an associative array")
val aMap = Map("first" -> 1, "second" -> 2, "third" -> 3)

println("\nAll collections implement the Traversable and Iterable trait\n")
println("\nThus the same operation can be applied to all collections")
aList map println
aVector map println
aQueue map println
aStack map println
aMap map println

aVector.toList
aStack.toArray
