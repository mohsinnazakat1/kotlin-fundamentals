package com.example.kotlinfundamentals

// single line comment 
/*mutli line comment in kotlin*/

// function implementation in kotlin
// fun main () {
//     print("Hello World")

// }


// fun main () {
//     val name = "Mohsin"
//     // string contcatination
//     print("Hello World " + name)

// }



// fun main () {
//     val first_name = "Mohsin" // val cannot be re-assigned (immutable)
//     var last_name = "Nazakat" // var can be re-assigned (mutable)

//     //use var when you belive something needs to be changed in that variable later 


// }

//kotlin is a typed language (you assign a value to variable and kotlin determins tha type)

// fun main () {
//     val first_name = "Mohsin" //String
//     var age = 23 // int 

//     //We also have other int type 
//     //Byte (8 bit)
//     //Short (16 bit)
//     //Int (32 bit)
//     //Long (64 bit)

//     // you can assign type like this 
//     var age: Byte = 23 // int 
//     var age: Short = 23 // Short

//     var myfloat: Float = 14.12F
//     //or
//     var myfloat = 14.12F

//     // by default it will be doubble (for more speady calculations )
//     var mydouble = 41.45


//}

// fun main () {
//     //boolean variables stores logical values true or false 
//     var isBoolean = true 
//     isBoolean = false
    
// }


// fun main () {
//     //boolean variables stores logical values true or false 
//     var isBoolean = true 
//     isBoolean = false

//     // Charecter is also a datatype
//     var token = 'h'
//     val dig_token = '1'
//     //Strings is collection of multiple chars 
//     var name = "Mohsin"
//     val name_at_1 = name[0]
//     val name_at_2 = name[1]
//     val name_at_3 = name[2]
//     val name_at_4 = name[3]
//     val name_at_last = name[name.length -1]
    
// }


// Arithmatic operations 
// fun main () {
//     var result = 2+2
//     result = result + 2
//     result = result - 2
//     result = result / 2
//     result = result * 2
//     result += 2
//     result -= 2
//     result /= 2
//     result *= 2

//     result = 15%2
//     // % mod operator gives the remainder 

//     // dividing two int will result in int as well even if the answer is float 
//     // we can do explicit type casting 



    
// }

// // Comparison Operator (== != <= >= < >)
// fun main () {
//     val isEqual = 5==2
//     print(isEqual)
//     print("value of isEqual is $isEqual") // other way of concatination

//     //in the same way we can use rest of the comparison operators 

//     println("\nis 5 greater than 3 ${5>3}") // another feature of kotlin called string interpolation 
    
// }



// Assignment operators (+= -= *= =/ %=)
// fun main () {

//     var result = 2
//     result += 2
//     result 8= 2
//     result /= 2

//     // increment decrement operators 
//     // variable_name ++ variable_name -- 
//     // a++ executes then increment 
//     // ++a increment then executes 

// }


// if statement 

// fun main (){
//     print("\n Enter the number = ")
//     val number = Integer.valueOf(readLine())
//     if (number%2==0)
//         print("$number is an even number")
//     else
//         print("$number is an odd number")
// }

 //when  expression replacement of swithc 

//  fun main (){
//      var season =3 
//      when (season){
//          1 -> print("Hey! Winter")
//          2 -> print("Hey! Summer")
//          3 -> print("Hey! Spring")
//          4 -> {
//              print("Hey! Autumn")
//          }
//          else -> {
//              print("Invalid Season")
//          }
             
//      }

//      var month = 3 
//      when (month){
//          in 4..6 -> print("Hey Summmer")
//          in 7..9 -> print("Hey Autumn")
//          in 10..12 -> print("Hey Winter")
//          1,2,3 -> print("Hey Spring")
//          else -> print ("Invalid Season")
         
//      }

//      var age = 18
//      when (age){
//          !in 1..15 -> print ("Cannot be given Sinopharm and Sputnik")
//          in 16..20 -> print ("Sinopharm is good vaccine")
//          in 21..40 -> print ("Sputnik is good vaccine")
//          else -> print("Any vaccine would work")
//      }

//      var test_val: Any = 13.1F
//      when(test_val){
//          is Int -> print ("$test_val is int ")
//          is Double -> print ("$test_val is Double ")
//          is Float -> print ("$test_val is Float ")
//          else -> print("$test_val is something else")
//      }
//  }