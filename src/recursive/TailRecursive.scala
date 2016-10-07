package recursive

object TailRecursive extends App {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n <= n / 2) prev
      else loop(n - 1, cur, prev + cur)
    loop(n, 0, 1)
  }

  println(fib(3))

}