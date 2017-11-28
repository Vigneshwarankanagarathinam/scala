package com.training.generics

object ScalaGenericsTest {
 
  def main(args: Array[String]) 
  { 
//    val stackInt = new Stack[Int]
//    stackInt.push(1)
//    stackInt.push(2)
//   
//    
//    println(stackInt.pop)  // prints 2
//    println(stackInt.pop)  // prints 1
    
    val stackFruit = new Stack[Fruit]
    val apple = new Apple
    val banana = new Banana

    stackFruit.push(apple)
    stackFruit.push(banana)
    
    println(stackFruit.pop)  // prints Banana
    println(stackFruit.pop)  // prints Apple
  }
}

class Stack[R] {
  private var elements: List[R] = Nil
  def push(x: R) { elements = x :: elements }
  def peek: R = elements.head
  def pop(): R = {
    //println("peek=>" + peek) 
    val currentTop = peek
    //println("currentTop=>" + currentTop) 
    elements = elements.tail
    //println("elements=>" + elements) 
    //println("currentTop=>" + currentTop) 
    currentTop
  }
}

/**/

class Fruit
class Apple extends Fruit
class Banana extends Fruit