//singleton object
object Fun {
  def func1(x:Double, y:Int) = x + (70 * y)
  def ex(a:Double) = 50 + a
  def func2a(p1:(Int,Int),p2:(Int,Int)):(Int,Int) = (p1._1+p1._2,p2._1*p2._2)
  def fact(n: Int):Long = if (n==0) 1 else n * fact(n-1)
}