// In java, without class we can not run a program but in kotlin we can even create program with function
// as we know it is function programming language.
// KOTLIN is stricktly (you can'nt change the viable type) type language. In kotlin there are two ways to create
// variables ,
// 1- val -- immutable (recommended)
// 2- Var--  mutable

fun main() {

    var size1 : Int = 50
    var size2 = 50

    size1= 60

    val size3 : Int =50
   // size3 = 60      // val can not be reassigned

    println(s2.length)
  //  above line give error  " lateinit property s2 has not been initialized " because we have'nt initialize it.


}

var s1 : String = " KOTLIN "
// In kotlin , there is no concept of default value of variable like java,(in java , local should be intialize)
// both local and global should be initialize


lateinit var s2 : String
//  lateinit KEYWORD help us to define variable without intializing but we have to initialize it before using it.

// primitive type is consider as class in kotlin like (Int,Double ), you can'nt define it as int.

// val double : Double = 10
// Automatic type Casting is not allowed in Kotlin , above code will not be executed












