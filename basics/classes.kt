/**
 * Class prototype in KotLin
 */

 class Employee(val name: String, var age: Int, var employeeNumber: Int, var rank: String){
    var Name = this.name
    var Age = this.age
    var EmployeeNumber = this.employeeNumber
    var Rank = this.rank
 }

 class Rectangle(var height: Double, var length: Double){
    var perimeter = (height + length) * 2
 }

 fun main() {
    var rectangle = Rectangle(10.0, 15.0)

    println("The perimeter is ${rectangle.perimeter}")

    var square = Square(16.0)

    println("The perimeter is ${square.perimeter}")
 }


 open class Shape

 class Square(var length: Double): Shape() {
    var perimeter = (length * 4)
 }