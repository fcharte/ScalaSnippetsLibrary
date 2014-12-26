// HOW TO USE: scala -cp "weka-3.7.6.jar;mulan.jar" IterateArray.scala 
import mulan.data._
val mld = {new MultiLabelInstances("emotions.arff", "emotions.xml")}

val labelNames = mld.getLabelsMetaData.getLabelNames.toArray

println("\nLabel names array:" + labelNames)

println("\nIterating with for\n")
for(label <- labelNames) println(label)

println("\nIterating with while\n")
val it = Iterator(labelNames)
while(it.hasNext)
  println(it.next())

println("\nIterating with foreach\n")
labelNames.foreach { println }
labelNames foreach println  // This syntax is also allowed

println("\nApplying a function to every element with map\n")
labelNames.map(_.toString.length)
