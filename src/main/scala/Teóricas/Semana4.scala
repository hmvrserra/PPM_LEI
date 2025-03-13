package Teóricas

object Semana4 {
    
  def concatFR(l1:List[Int], l2:List[Int]):List[Int] = {
    (l1 foldRight l2)((x, r) => x :: r)
  }

  def concatFL(l1:List[Int], l2:List[Int]):List[Int] = {
    (l2 foldLeft l1)((r, x) => r :+ x)
  }
  def main():Unit={
    println(concatFR(List(1, 2, 3), List(4, 5, 6)))
    print(concatFL(List(1, 2, 3), List(4, 5, 6)))
  }
}
