package com.training.closure

object ScalaClosureTest extends App {
  
    var hello = "Hello"   
    def sayHelloEnglish(name: String) { 
   //   println(s"$hello, $name") 
    }

    var helloSpanish = "Hola"
    def sayHelloSpanish(name: String) { 
      println(s"$helloSpanish, $name") 
    }
    
    // execute sayHello from the exec method ClosureMethodTest
    val closureMethodTest = new ClosureMethodTest
    closureMethodTest.closureMethod(sayHelloEnglish, "Ramesh")
        
    closureMethodTest.closureMethod(sayHelloSpanish, "Dinesh")
    
    
}

class ClosureMethodTest {
  // A method that takes "Function" & "String", and 
  // passes the string into function and executes it.
  def closureMethod(f:(String) => Unit, name: String) {
    f(name)
  }
}