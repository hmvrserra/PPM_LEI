package Teóricas

import scala.compiletime.ops.string.Length

object Semana2 {
  
  def listOfDuplicates[A](x: A, length: Int): List[A] = {
    if(length < 1) Nil //List()
    else x :: listOfDuplicates(x, length - 1) //Concatenar x à lista de tamanho length - 1
  }
  
  def guess(x: Int): String = x match {
    case 42 => "correct!"
    case _ => "wrong guess!"
  }
  
  def isPal[E](lst: List[E]):Boolean = lst match {
    case List() => true //Nil => true
    case List(x) => true //x::Nil => true
    case x::xs => if (x == xs.last) isPal(xs.init) else false
  }
  
  def main(): Unit  = {
    println(listOfDuplicates[Int](3, 4)) //List(3, 3, 3, 3)
    println(listOfDuplicates[String]("La", 8)) //List(La, La, La, La, La, La, La, La)
    println(guess(21))
    println(guess(0))
    println(guess(42))
    println(isPal(List(1, 2, 2)))
    print(isPal(List(1, 2, 1)))
  }
}
