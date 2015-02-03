println("\nDifferent kind of strings\n")
val basicString = "This is a basic character string"
val scapeCharacters = "\tString with \"escape\" characters\n"
val multilineString = """This is a string
  |with multiple lines
  |of text""".stripMargin

println("\nString interpolation\n")
val name = "Francisco"
print(s"Hello $name")

println("\nString methods\n")
println("String length: " + name.length)
println("3rd character in string: " + name(2))
println("toUppercase: " + name.toUpperCase)
println("startsWith: " + name.startsWith("Fra"))
println("endsWidth: " + name.endsWith("com"))
println("replaceAll: " + name.replaceAll("c", "x"))
println("substring: " + name.substring(3, 7))
println("split:" + multilineString.split(" ").map(println _))

println("\nStringOps operators\n")
println("Repeating a string: " + name * 3)
println("Sequence of operations: " + ("Hello " /: (1 to 4))(_ * _))
println("Combinations: " + name.combinations(8).toList)