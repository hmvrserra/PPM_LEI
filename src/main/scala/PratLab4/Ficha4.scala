package PratLab4

object Ficha4 extends App {

  def sum(xs:List[Int]):Int = (xs foldRight 0)((x: Int, y:Int) => x+y)
  
  def andFRight(list:List[Boolean]):Boolean =
    (list foldRight true) ((x:Boolean, y:Boolean) => x||y)

  def remDup[T](list: List[T]): List[T] =
    list.foldRight(List.empty[T]) {
      case (elem, acc) if acc.headOption.contains(elem) => acc
      case (elem, acc) => elem :: acc
    }


  type Team = String
  type Goals = Int
  type Match = ((Team, Goals),(Team, Goals))
  type Fixtures = List [Match]

  def noItself(a: Match, b:Match): Boolean =
    ()


  println(sum(List(1, 2, 3)))
  println(andFRight(List(false, false, false)))
  print(remDup(List(1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5)))
}
