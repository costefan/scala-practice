package demo

object MyApp {

  // Y - CBN
  def constOne(x: Int, y: => Int) = 1

  def loop(x: Int): Int = loop(x)

  def square(x: Double): Double = x * x

  def sqrt(x: Double) = (y: Double) =>  y>=0 && square(y) == x

  def main(args: Array[String]): Unit =
  {
//    constOne(1 + 2, loop(1))
//    println("AAA")
//    constOne(loop(1), 1 + 2)
    println("AAA2")
    println(sqrt(4)(2))
    println("aaa")
  }
}
