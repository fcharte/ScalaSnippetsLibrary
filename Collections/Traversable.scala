import scala.collection.immutable._

val aQueue = Queue("first", "second", "third")
val aStack = Stack("third", "second", "first")

val allData = aQueue ++ aStack

allData foreach println