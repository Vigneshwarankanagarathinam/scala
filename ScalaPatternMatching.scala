Program:


class ScalaPatternMatching {
  
   def invokeClass(): Unit = {  
    println(matchTest("two")) 
    println(matchTest("scala")) 
   }
   
   def matchTest(x: Any): Any = x match { 
     case 1 => "one" 
     case "two" => 2 
     case y: Int => "scala.Int" 
     case _ => "many" 
   }
  
}

Output:

2
many
