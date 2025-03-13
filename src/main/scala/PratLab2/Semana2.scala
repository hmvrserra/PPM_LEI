package PratLab2

object Semana2 {

  def ex1(): Unit = {
    println("TODO!")
  }
  
  def transf[A] (lst: List[A]):List[A] = lst match {
    case Nil => Nil
    case x :: Nil => x :: Nil
    case x :: y :: xys => y :: x :: transf(xys) 
  }
  
  def listProduct (lst: List[Int]): Int = lst match {
    case Nil => 1
    case x :: Nil => x
    case x :: xys => x * listProduct(xys) 
  }
  
  def putAtEnd (lst: List[String], a: String): List[String] = lst match {
    case Nil => a :: Nil
    case x :: xs => x :: putAtEnd(xs, a)
  }
  
  def concatLists[A] (lst1: List[A], lst2: List[A]): List[A] = lst1 match {
    case Nil => lst2 ::: Nil
    case x :: xs => x :: concatLists(xs, lst2)
  }
  
  def sumEl (lst: List[(Int, Int)]): Int = lst match {
    case _ :: _ :: (a, b) :: _ :: (c ,d) :: xs => a + b + c + d
    case _ :: _ :: (a, b) :: _ => a + b
    case _ => 0
  }
  
//  def lengthAndSum (lst: List[Int]): (Double, Double) = lst match {
//    case Nil => (0, 0)
//    case head :: tail => {
//      val recursionResult = lengthAndSum(tail)
//      (recursionResult._1 )
//    }
//  }
//  
//  def metH (lst: List[Double], a: Double): (List[Double], List[Double]) = {
//    val below: numbers.filter
//    (_ < a)
//    val aboveOrEqual: numbers.filter
//    (_ >= a)
//    (below, aboveOrEqual)
//  }
  
  def main(args: Array[String]): Unit = {
    ex1()
    
    println(transf(List(1, 2, 3, 4, 5, 6)))
    println(transf(List(1, 2, 3, 4, 5)))
    println(transf(List()))
    
    println(listProduct(List(3)))
    println(listProduct(List(3, 2 ,6 , 7)))
    println(listProduct(List(3, 0)))
    
    println(putAtEnd(List("Olá", "eu", "sou", "o"), "Hugo"))
    println(putAtEnd(List(), "Hey!"))

    println(concatLists(List("Olá", "eu"), List("sou","o" , "Hugo")))
    
    println(sumEl(List((1,2), (3,4), (2,0))))
    println(sumEl(List((1,2),(3,4),(2,0),(5,6),(1,1))))
    
    
  }
}
