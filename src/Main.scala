

object Main {

  def sum(f: Int => Int, a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int = sum(id, a, b)
  def sumSquares(a: Int, b: Int): Int = sum(square, a, b)
  def sumPowersOfTwo(a: Int, b: Int): Int = sum(powerOfTwo, a, b)

  def id(x: Int): Int = x
  def square(x: Int): Int = x * x
  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

  def main(args: Array[String]): Unit = {
    println("sum ints 1 to 4 = " + sumInts(4, 5))
    println("sum ints 1 to 4 squared = " + sumSquares(1, 2))
    println("sum ints powerOfTwo = " + sumPowersOfTwo(1, 2))
  }

}