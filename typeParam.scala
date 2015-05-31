/**
 * Created by ikawa on 2015/05/30.
 */
val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"
for (i <- 0 to 2) print(greetStrings(i))

println("")

val numNames = Array("zero", "one", "two")
numNames.foreach(print)
