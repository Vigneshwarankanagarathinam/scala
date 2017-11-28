package com.training.strait

trait Printable{        //define trait
    def print()         // Trait Abstract method  
    def show(){         // Trait Non-abstract method  
        println("This is show method...Trait Printable")  
    }  
}  

trait Showable{  
   def Showable()  
}  

class A4 extends Printable with Showable {  // Class extending 2 Traits
    def print(){  
        println("This is printable....A4 class")  
    }  
    def Showable(){  
        println("This is showable....A4 class")  
    }  
}  

abstract class A6 extends Printable{            // Must declared as abstract class as Printable.print is not implemented.
   def printA6(){  
       println("Hello, this is A6 Sheet....A6 class")    
   }  
}

class A12 extends A6{                         // A12 class implements Printable.print method.
   
  def print(){  
        println("This is printable....A12 class")  
    }  
}

object ScalaTraitTest {
  def main(args:Array[String]){  
//        var a = new A4()  
//        a.print()  
//        a.show()
//        a.Showable()  
        
        var b = new A12()
        b.printA6()
        b.print()
        b.show()
    }  
}