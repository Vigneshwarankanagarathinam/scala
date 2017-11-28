

package com.training

class ScalaClassTest {
  
   def invokeClass(): Unit = {  

     println("Invoked ScalaClassTest....") 
     
     var a=9
    
     
     //while loop
//     while(a<10){  //Relational Operators
//       println("while loop a=>"+ a)
//       a = a + 1  //Arithmetic operator
//     }
    
     //do while
//     do{
//       println("do while loop a=>"+ a)
//       a = a + 1  //Arithmetic operator       
//     }while(a<=12)
       
       
//     for loop with collection
     val numList = List(6,7,8)
//     for ( b <- numList ){
//       println("for loop b=>"+ b)
//     } 
  
//     var lastValue =  for {
//                           c <- numList 
//                           if c != 7
//                     } yield c
//     
//     println("yield value lastValue=>"+ lastValue)  
     
        
//     val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F") 
//     colors.keys.foreach{ i => 
//                           print( "Map Key = " + i ) 
//                           println(" Value = " + colors(i) )
//                         } 
     
     //tuple can hold objects with different types
//     val t = (4,"tuple",2.0,true)
//     t.productIterator.foreach{
//       i =>println("tuple Value = " + i )}
  }
   
}