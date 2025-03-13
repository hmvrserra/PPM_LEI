package PratLab4

object Ficha4 extends App {

  def sum(xs:List[Int]):Int = (xs foldRight 0)((x: Int, y:Int) => x+y)
  
  println(sum(List(1, 2, 3)))
}
