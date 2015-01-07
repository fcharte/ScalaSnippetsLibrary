println("\nChar and String data types\n------------------")

println("\nRange of characters")
println("\nChar: [" + Char.MinValue + " (" + Char.MinValue.toLong + ")" +
  ", " + Char.MaxValue + " (" + Char.MaxValue.toLong + ")" + "]")

val letter = 'A'
println("\nLetter " + letter + " has code " + letter.toByte)
println("\nLetter " + letter + " as digit has value " + letter.asDigit)

val letter2 = 97.toChar
println("\nCode 97 is letter " + letter2)

println("\nTest type of character")
println(letter + " isDigit = " + letter.isControl)
println(letter + " isLetter = " + letter.isLetter)
println(letter + " isLetterOrDigit = " + letter.isLetterOrDigit)
println(letter + " isLower = " + letter.isLower)
println(letter + " isUpper = " + letter.isUpper)
println(letter + " isSpaceChar = " + letter.isSpaceChar)

println("\nCharacter conversion")
letter.toLower
letter2.toUpper

println("\nUnicode characters")
val euro = 8364.toChar
val filleddot = 0x2022.toChar

println("\nCharacters in a string")
for (c <- "A string") println("'" + c + "' " + c.toInt)