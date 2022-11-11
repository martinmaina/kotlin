/**
 * Read only variables are created using the val keyword
 * Variables that are to change are created using 
 * the var keyword. val variables are immutable and are 
 * read only. They cannot be reassigned new values. 
 */

val PI = 3.141592654
fun main() {
   val num1: Int = 1 // declaration and immediate assigment.file
   val num2 = 2 // Int type is inferred 
   val num3: Int // type required whn no initializer is provided. 
   num3 = 3 // deferred assignment 

   println("num1 = $num1\t num2 = $num2\t num3 = $num3")
   var num4 = 5 
   num4 += 10

   println("Value of num4 is $num4")

   var radius = 7.0

   println("The area of the circle with radius $radius units is ${areaOfCircle(radius)}")
   
}

// Function to calculate the area of a circle 
fun areaOfCircle(radius: Double) = PI * radius * radius 