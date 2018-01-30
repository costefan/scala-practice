object Fibonacci {
  println("welcome")
  def fib(n: Int): Int =
    if (n == 0) 0
    else
      if (n == 1) 1
      else fib(n - 1) + fib(n - 2)

  fib(0)
  fib(1)
  fib(2)
  fib(3)

  def ifib(n: Int): Int = {
    @annotation.tailrec
    def fibIter(a: Int, b: Int, i: Int): Int =
      if (n == i) a
      else fibIter(a + b, a, i+1)

    fibIter(0, 1, 0)
  }

  ifib(0)
  ifib(1)
  ifib(2)
  ifib(3)
}