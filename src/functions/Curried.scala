package functions

object Curried extends App {

  def multiply(m: Int)(n: Int): Int = m * n
  val timesTwo = multiply(2)(_: Int)

  val curriedAdd = (PartialFunctions.adder _).curried
  val addTwo = curriedAdd(2)

  println(multiply(2)(3))
  println(timesTwo(5))
  println(addTwo(1))

}