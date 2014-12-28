println("\nGetting a numeric array with Array.range()")
val years = Array.range(1995, 2005)

println("\nThe array length is " + years.length + " items")

println("\nScala arrays use 0-based indexes")
for (i <- 0 to years.length-1)
  println(years(i))

println("\nNo need to use indexes")
for(item <- years) println(item)

println("\nFor loop with two indexes")
for (i <- 1 to 10; m <- 1 to 10) {
  print(i + "X" + m + " = " + (i * m) + " | ")
  if(m % 10 == 0) println
}

println("\nConditional for loop")
for (item <- years if item % 2 == 0) println(item)

println("\nFor/Yield to generate a new array")
val evenYears = for (item <- years if item % 2 == 0) yield item
