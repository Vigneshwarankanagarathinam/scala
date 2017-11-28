package com.training.generics

object ScalaFunctionTest {

  def main(args: Array[String]) 
  { 
   // println(fun(30))
     println(fun(15,2))
    //  println(fun(y=15,x=6))
  
  }
  
  def fun(x:Int, y:Int):Int={
      println(x)
      println(y)
      x+y 
  }
  
}