package demo

object SecondTask {

  def and(x: Boolean, y: => Boolean) = x && y

  def or(x: Boolean, y: => Boolean) = x || y

  def loop(x: Boolean): Boolean = loop(x)

  def method(args: Array[String]): Unit = {
    println(and(false, loop(true)))
  }
}
