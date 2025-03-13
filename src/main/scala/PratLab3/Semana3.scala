package PratLab3

import scala.annotation.tailrec

object Semana3 {
  
  def factorial1(n: Int): Int = n match{
    case 1 => 1
    case _ => n * factorial2(n - 1)
  }
  
  def factorial2(n: Int): Int = {
    if (n > 1) n * factorial2(n - 1)
    else n * 1
  }
  
  def factorial3(n: Int): Int = {
    @tailrec
    def loop(acc: Int, n: Int): Int= {
      if (n==0) acc
      else loop(acc * n, n-1)
    }
    loop(1, n)
  }
  
  def main(): Unit = {
    println(factorial1(5))
    println(factorial2(5))
    println(factorial3(5))
  }
}
