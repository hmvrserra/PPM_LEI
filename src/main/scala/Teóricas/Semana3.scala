package Teóricas

import scala.annotation.tailrec

object Semana3 {
  def expr = {
    val x = { print("x"); 1 }
    lazy val y = { print("y"); 2 }
    def z = { print("z"); 3 }
    z + y + x + z + y + x 
  }
  
  def sum(f:Int => Int, a:Int, b:Int):Int = {
    if(a == b) f(b)
    else f(a) + sum(f, a+1, b) 
  }

  def op(f:Int => Int, a:Int, b:Int, operator:(Int, Int) => Int):Int = {
    if(a == b) f(b)
    else operator(f(a), op(f, a+1, b, operator))
  }
  
  //Mapping
  
  def scaleList(xs: List[Double], factor: Double) =
    xs map (x => x*factor)
    
  def squareList(xs: List[Int]): List[Int] =
    xs map (x => x * x)
    
//  def sum(f: Int => Int, a: Int, b: Int): Int = {
//    @tailrec
//    def loop(a1: Int, acc: Int): Int = {
//      if (a1 >= b) f(b) + acc
//      else loop(a1 + 1 , acc + f(a1))
//    }
//    loop(a, 0) 
//  }
  
  def main(): Unit = {
    expr
    println()
    println(sum(x => x * x, 2, 3))
    println(op(x => x * x, 2, 3, (y, z) => y * z))
    
    println(scaleList(List(1.0, 2.0, 3.0), 2.5))
    println(squareList(List(1, 2, 3, 4)))
  }
}
