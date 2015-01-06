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
letter.isControl
letter.isDigit
letter.isLetter
letter.isLetterOrDigit
letter.isLower
letter.isUpper
letter.isSpaceChar

println("\nCharacter conversion")
letter.toLower
letter2.toUpper

println("\nUnicode characters")
val euro = 8364.toChar

println("\nCharacters in a string")
for (c <- "A string") println("'" + c + "' " + c.toInt)