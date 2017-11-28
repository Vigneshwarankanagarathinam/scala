package com.training

object ScalaTest {

  val greeting: String = "Hello, world!"   //FIELD VARIABLES
  
  
  def main(args: Array[String]) 
  { 
     val distribution: String = "Cloudera"   //LOCAL VARIABLES
     
     println("greeting=>"+ greeting ) 
  //   println("distribution=>"+ distribution )
     
//     println("Get Bigdata techonogies=>"+ getBigDataStack(true) ) 
  //   println("Get distribution version=>"+ getBigDataStack(false) ) 
     
//     val sctObject = new ScalaClassTest();
//     sctObject.invokeClass()
    
     new ScalaPatternMatching().invokeClass()
  } 
  
  def getBigDataStack(flag : Boolean): Any = {  //METHOD VARIABLES

    var bigDataStack: Any = null;
    
    if(flag){  //if statement must consists of only Boolean expression
      bigDataStack = "MR Hive Spark ...."
    } else{
      bigDataStack  = 3
    }
    return bigDataStack    
  }
  
}