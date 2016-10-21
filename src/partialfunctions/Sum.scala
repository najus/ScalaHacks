package partialfunctions

object Sum {

  def sum(a: Int, b: Int, c: Int) = a + b + c
  def main(args: Array[String]) {
    val x = sum _
    println(x(1, 2, 3))

    val b = sum(1, _: Int, 3)
  }
}