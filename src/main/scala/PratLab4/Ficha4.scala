package PratLab4

object Ficha4 extends App {

  def sum(xs:List[Int]):Int = (xs foldRight 0)((x: Int, y:Int) => x+y)
  
  def andFRight(list:List[Boolean]):Boolean =
    (list foldRight true) ((x:Boolean, y:Boolean) => x||y)
  
  
  println(sum(List(1, 2, 3)))
  println(andFRight(List(false, false, false)))
}
