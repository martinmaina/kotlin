// Functions in Kotlin
//  A function to add two numbers
// A function that take two argument parameters and returns
// the sum


fun sum(num1: Int , num2: Int): Int{
    return num1 + num2
}

// Main function
fun main() {
    val a = 20
    val b = 30
    print(" The sum of $a and $b is ") 
    println(sum(a,b))
    printSum(a,b)
}

//  The sum of 20 and 30 is 50

// Inferring the return type
fun sum2(num1: Int, num2: Int) = num1 + num2 

// A function that return no meaningful value 
fun printSum(num1: Int, num2: Int): Unit{
    println("$num1 + $num2 = ${num1 + num2}")
}