package functions

object PartialFunctions {
  def adder(m: Int, n: Int) = m + n
  val add2 = adder(2, _: Int)
  val add3 = adder(3, _: Int)

  def main(arg: Array[String]) {
    println(add2(2))
    println(add3(3))
  }
}